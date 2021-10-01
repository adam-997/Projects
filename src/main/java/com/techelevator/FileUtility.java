package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtility
{

    File file;

    public FileUtility(String fileName)
    {

        this.file = new File(fileName);
    }

    public File getFile()
    {
        return file;
    }

    public List<VendingMachineItem> readInventoryFile() throws FileNotFoundException
    {

        if (!this.file.exists())
        {
            throw new FileNotFoundException();
        }

        List<VendingMachineItem> products = new ArrayList<>();

        Scanner scanner = new Scanner(this.file);
        while (scanner.hasNext())
        {
            String line = scanner.nextLine();
            String[] lineArr = line.split("\\|");

            String slot = lineArr[0];
            String name = lineArr[1];
            BigDecimal price = new BigDecimal(lineArr[2]);
            String type = lineArr[3];

            VendingMachineItem item = null;
            if (type.equals("Chip"))
            {
                item = new ChipItem(slot, name, price, type);
            } else if (type.equals("Candy"))
            {
                item = new CandyItem(slot, name, price, type);
            } else if (type.equals("Drink"))
            {
                item = new DrinkItem(slot, name, price, type);
            } else if (type.equals("Gum"))
            {
                item = new GumItem(slot, name, price, type);
            }

            products.add(item);
        }


        return products;
    }

    public void writeAuditFile(String message)
    {

        try
        {
            String timeStamp = generateDateTimeStamp();
            message = " " + timeStamp + " " + message + "\n";

            PrintWriter writer = new PrintWriter(new FileOutputStream(this.file.getAbsoluteFile(), true));

            writer.append(message);
            writer.flush();
            writer.close();

        } catch (FileNotFoundException e)
        {
            System.out.println("Problem writing to log file.");
        }
    }

    private String generateDateTimeStamp()
    {

        LocalDateTime timeStamp = LocalDateTime.now();
        DateTimeFormatter timeStampFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");

        return timeStamp.format(timeStampFormatter);
    }


}
