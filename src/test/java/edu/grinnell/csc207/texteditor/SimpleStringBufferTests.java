package edu.grinnell.csc207.texteditor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleStringBufferTests {
    /@Test
    void testInsert() {
        SimpleStringBuffer str = new SimpleStringBuffer();
        str.insert('H');
        str.insert('i');
        assertEquals("Hi", str.toString());
        assertEquals(2, str.getCursorPosition());
        assertEquals(2, str.getSize());
        assertEquals('H', str.getChar(0));
    }
}
