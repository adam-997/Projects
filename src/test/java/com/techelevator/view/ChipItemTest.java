package com.techelevator.view;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.techelevator.ChipItem;

public class ChipItemTest {
    ChipItem chips;

    @Before
    public void setUp() throws Exception {
        chips = new ChipItem("A2", "Papas", new BigDecimal(2.00), "Chip");
    }

    @Test
    public void testConstructor() {
        assertEquals("A2", chips.getSlot());
        assertEquals("Papas", chips.getName());
        assertEquals("2", chips.getPrice().toString());
        assertEquals("Chip", chips.getCategory());
    }
}
