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
        this.capacity = 2;
        this.arr = new char[this.capacity];
        this.index = 0;
        this.size = 0;
    }

    public void insert(char ch) {
        if (size >= capacity) {
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
        if (index < size) {
            index++;
        }
    }

    public int getSize() {
        return size;
    }

    public char getChar(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        }
        return arr[i];
    }

    @Override
    public String toString() {
        String str = new String(arr, 0, size);
        return str;
    }

    private void expandBuffer() {
        int newCapacity = capacity * 2;
        char[] newArray = new char[newCapacity];
        System.arraycopy(arr, 0, newArray, 0, size);
        arr = newArray;
        capacity = newCapacity;
    }
}
