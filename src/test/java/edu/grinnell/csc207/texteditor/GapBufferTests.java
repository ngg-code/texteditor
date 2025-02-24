package edu.grinnell.csc207.texteditor;

public class GapBufferTests {
    private GapBuffer buffer;

    @Test
    void testInsertCharacters() {
        buffer.insert('H');
        buffer.insert('e');
        buffer.insert('l');
        buffer.insert('l');
        buffer.insert('o');

        assertEquals("Hello", buffer.toString());
        assertEquals(5, buffer.getSize());
        assertEquals(5, buffer.getCursorPosition());
        buffer.delete();
        assertEquals("Hell", buffer.toString());
        assertEquals(0, buffer.getSize());
        assertEquals(0, buffer.getCursorPosition());
    }
}
