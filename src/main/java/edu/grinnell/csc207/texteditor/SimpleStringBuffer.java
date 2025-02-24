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
        if (index >= arr.length) {
            expandBuffer();
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = ch;
        index++;
        size++;
    }

    public void delete() {
        if (index > 0) {
            for (int i = index - 1; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            index--;
            size--;
        }
    }

    public int getCursorPosition() {
        return index;
    }

    public void moveLeft() {
        if (index > 0) {
            index--;
            }
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
