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

}
