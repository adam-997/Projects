package com.techelevator;

import java.math.BigDecimal;

public class DrinkItem extends VendingMachineItem
{

    public DrinkItem(String slot, String name, BigDecimal price, String category)
    {
        super(name, price, category, slot);
    }

    @Override
    public String consume()
    {
        return "Glug Glug, Yum!";
    }
}
