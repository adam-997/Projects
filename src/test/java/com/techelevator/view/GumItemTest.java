package com.techelevator.view;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.techelevator.GumItem;

public class GumItemTest {
    GumItem gum;

    @Before
    public void setUp() throws Exception {
        gum = new GumItem("D2", "GumGum", new BigDecimal(2.00), "Gum");
    }

    @Test
    public void testConstructor() {
        assertEquals("D2", gum.getSlot());
        assertEquals("GumGum", gum.getName());
        assertEquals("2", gum.getPrice().toString());
        assertEquals("Gum", gum.getCategory());
    }
}
