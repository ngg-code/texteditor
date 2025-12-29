package edu.grinnell.csc207.texteditor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleStringBufferTests {
    @Test
    void testInsert() {
        SimpleStringBuffer str = new SimpleStringBuffer();
        str.insert('H');
        str.insert('i');
        assertEquals("Hi", str.toString());
        assertEquals(2, str.getCursorPosition());
        assertEquals(2, str.getSize());
        assertEquals('H', str.getChar(0));
        str.delete();
        assertEquals("H", str.toString());
        assertEquals(1, str.getCursorPosition());
        assertEquals(1, str.getSize());
        assertEquals('H', str.getChar(0));
        str.delete();
        assertEquals("", str.toString());
        assertEquals(0, str.getCursorPosition());
        assertEquals(0, str.getSize());
    }

    @Test
    void testMoveCursor() {
        SimpleStringBuffer str = new SimpleStringBuffer();
        str.insert('A');
        str.insert('B');
        str.insert('C');
        str.moveLeft();
        str.moveLeft();
        assertEquals(1, str.getCursorPosition());
        str.moveRight();
        assertEquals(2, str.getCursorPosition());
    }

    @Test
    void testBufferExpansion() {
        SimpleStringBuffer str = new SimpleStringBuffer();
        str.insert('a');
        str.insert('b');
        str.insert('c');
        str.insert('d');
        str.insert('e');
        str.insert('f');
        str.insert('g');
        str.insert('h');
        str.insert('i');
        str.insert('j');
        str.insert('k');
        str.insert('l');
        assertEquals("abcdefghijkl", str.toString());
        assertEquals(12, str.getCursorPosition());
    }

}