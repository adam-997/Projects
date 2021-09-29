package com.techelevator;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;



public class VendingMachineItems {


   /* private double balance = 0;
    File log = new File("/capstone/log.txt");

   public double getBalance(){
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public Map<String, Product> getInventory(File inputFile){

    }

    public void purchased(String slot) {
        Map<String, Product> inventory = getInventory(getProductFile());
        if(inventory.get(slot).isAvailable()){
            inventory.get(slot).purchaseItem();
            audit(inventory.get(slot).getName + " " + slot,getBalance());
            double newBalance = getBalance()-inventory.get(slot).getPrice();
            balance = newBalance;
            inventory.get(slot).displayMessage();

        }else {
            System.out.println("SOLD OUT");
        }
    }

}
*/
        private String name;
        private double price;

        public String getName () {
            return name;
        }

        public double getPrice () {
            return price;
        }

        public void setPrice ( double price){
            this.price = price;
        }

        public void setName (String name){
            this.name = name;
        }

    public VendingMachineItems(String name, double price) {
        this.name = name;
        this.price = price;

    }
            public void createItems(){
            VendingMachineItems chips = new VendingMachineItems("chips", 0.50);
            VendingMachineItems candy = new VendingMachineItems("candy",0.75);
            VendingMachineItems gum = new VendingMachineItems("gum",0.50);



     HashMap<VendingMachineItems,String> items = new HashMap<>();
        items.put(chips,"A1");
        items.put(candy,"B1");
        items.put(gum,"C1");
       // System.out.println(items);
                for(VendingMachineItems i: items.keySet()){
                    System.out.println("Name: " + i + "Location: " + items.get(i));
                }

                }


}

