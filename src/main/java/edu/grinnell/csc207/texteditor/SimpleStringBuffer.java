package edu.grinnell.csc207.texteditor;

/**
 * A naive implementation of a text buffer using a <code>String</code>.
 */
public class SimpleStringBuffer {
    public char[] arr;
    public int index;
    public int capacity;
    private int size;

    public SimpleStringBuffer() {
        this.capacity = 10;
        this.arr = new char[this.size];
        this.index = 0;
        this.size = 0;
    }

    public void insert(char ch) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    public void delete() {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    public int getCursorPosition() {
        throw new UnsupportedOperationException("Unimplemented method 'getCursorPosition'");
    }

    public void moveLeft() {
        throw new UnsupportedOperationException("Unimplemented method 'moveLeft'");
    }

    public void moveRight() {
        throw new UnsupportedOperationException("Unimplemented method 'moveRight'");
    }

    public int getSize() {
        throw new UnsupportedOperationException("Unimplemented method 'getSize'");
    }

    public char getChar(int i) {
        throw new UnsupportedOperationException("Unimplemented method 'getChar'");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
}
