package com.techelevator.view;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import com.techelevator.DrinkItem;
import org.junit.Before;
import org.junit.Test;


public class DrinkItemTest {
    DrinkItem drink;

    @Before
    public void setUp() throws Exception {
        drink = new DrinkItem("C2", "Cola", new BigDecimal(2.00), "Drink");
    }

    @Test
    public void testConstructor() {
        assertEquals("C2", drink.getSlot());
        assertEquals("Cola", drink.getName());
        assertEquals("2", drink.getPrice().toString());
        assertEquals("Drink", drink.getCategory());
    }
}
