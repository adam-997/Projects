package com.techelevator;

import java.math.BigDecimal;

public class CandyItem extends VendingMachineItem
{

    public CandyItem(String slot, String name, BigDecimal price, String category)
    {
        super(name, price, category, slot);
    }

    @Override
    public String consume()
    {
        return "Munch Munch, Yum!";
    }
}
