package com.techelevator;

import java.math.BigDecimal;

public class GumItem extends VendingMachineItem
{
    public GumItem(String slot, String name, BigDecimal price, String category )
    {
        super(name, price, category, slot);
    }

    @Override
    public String consume()
    {
        return "Chew Chew, Yum!";
    }
}
