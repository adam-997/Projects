package com.techelevator.view;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import com.techelevator.CandyItem;
import org.junit.Before;
import org.junit.Test;


public class CandyItemTest {
    CandyItem candy;

    @Before
    public void setUp() throws Exception {
        candy = new CandyItem("B2", "Chocolate", new BigDecimal(2.00), "Candy");
    }

    @Test
    public void testConstructor() {
        assertEquals("B2", candy.getSlot());
        assertEquals("Chocolate", candy.getName());
        assertEquals("2", candy.getPrice().toString());
        assertEquals("Candy", candy.getCategory());
    }
}
