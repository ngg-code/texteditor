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

    @Test
    void testDeleteBeyondStart() {
        buffer.delete(); // Should not crash
        assertEquals("", buffer.toString());
        assertEquals(0, buffer.getCursorPosition());
    }

    @Test
    void testMove() {
        buffer.insert('A');
        buffer.insert('B');
        buffer.insert('C');

        buffer.moveLeft();
        assertEquals(2, buffer.getCursorPosition());

        buffer.moveLeft();
        assertEquals(1, buffer.getCursorPosition());

        buffer.moveLeft();
        assertEquals(0, buffer.getCursorPosition());

        buffer.moveLeft(); // Should not go below 0
        assertEquals(0, buffer.getCursorPosition());

        buffer.moveRight();
        assertEquals(1, buffer.getCursorPosition());

        buffer.moveRight();
        assertEquals(2, buffer.getCursorPosition());

        buffer.moveRight();
        assertEquals(3, buffer.getCursorPosition());

        buffer.moveRight(); // Should not exceed size
        assertEquals(3, buffer.getCursorPosition());
    }

    @Test
    void testExpandBuffer() {
        for (int i = 0; i < 20; i++) {
            buffer.insert((char) ('a' + i));
        }

        assertEquals("abcdefghijklmnopqrst", buffer.toString());
        assertTrue(buffer.getSize() > 10, "Buffer should have expanded");
    }

    @Test
    void testGetChar() {
        buffer.insert('G');
        buffer.insert('o');
        buffer.insert('o');
        buffer.insert('d');

        assertEquals('G', buffer.getChar(0));
        assertEquals('o', buffer.getChar(1));
        assertEquals('o', buffer.getChar(2));
        assertEquals('d', buffer.getChar(3));
    }

}
