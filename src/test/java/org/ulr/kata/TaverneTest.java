package org.ulr.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaverneTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        Taverne app = new Taverne(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

}
