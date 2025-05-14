package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void testEveryStatement() {
        Item item1 = new Item("item1", 1, 100, 0);
        Item item2 = new Item("item2", 2, 400, 10);  // 10% попуст
        Item item3 = new Item("item3", 1, 50, 0);    // не исполнува услов

        double expected = 100 + (400 * (1 - 0.1) * 2) + (50) - 30;
        double result = SILab2.checkCart(List.of(item1, item2, item3), "1234567812345678");

        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testMultipleCondition() {
        Item item1 = new Item("item1", 1, 301, 0);   // само price > 300
        Item item2 = new Item("item2", 1, 100, 50);  // само discount > 0
        Item item3 = new Item("item3", 11, 50, 0);   // само quantity > 10
        Item item4 = new Item("item4", 1, 100, 0);   // сите false

        assertDoesNotThrow(() -> SILab2.checkCart(List.of(item1), "1234567812345678"));
        assertDoesNotThrow(() -> SILab2.checkCart(List.of(item2), "1234567812345678"));
        assertDoesNotThrow(() -> SILab2.checkCart(List.of(item3), "1234567812345678"));
        assertDoesNotThrow(() -> SILab2.checkCart(List.of(item4), "1234567812345678"));
    }
}
