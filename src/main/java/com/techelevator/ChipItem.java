package com.techelevator;

import java.math.BigDecimal;

public class ChipItem extends VendingMachineItem
{
    public ChipItem(String slot, String name, BigDecimal price, String category)
    {
        super(name, price, category, slot);
    }

    @Override
    public String consume()
    {
        return "Crunch Crunch, Yum!";
    }
}
