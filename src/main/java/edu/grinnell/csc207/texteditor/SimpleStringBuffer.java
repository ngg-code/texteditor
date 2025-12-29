package edu.grinnell.csc207.texteditor;

/**
 * A naive implementation of a text buffer using a <code>String</code>.
 */
public class SimpleStringBuffer {

    // The character array storing the buffer's content
    public char[] arr;
    // The index of the cursor in the buffer
    public int index;
    // The current capacity of the buffer
    public int capacity;
    // The current size of the buffer
    private int size;

    /**
     * Constructs a new SimpleStringBuffer with an initial capacity.
     */
    public SimpleStringBuffer() {
        this.capacity = 2;
        this.arr = new char[this.capacity];
        this.index = 0;
        this.size = 0;
    }

    /**
     * Inserts a character at the current cursor position.
     * If the buffer is full, it expands the buffer to accommodate the new
     * character.
     * 
     * @param ch the character to insert
     */
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

    /**
     * Deletes the character before the cursor position.
     * If the cursor is at the start, it does nothing.
     */
    public void delete() {
        if (index > 0) {
            for (int i = index - 1; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            index--;
            size--;
        }
    }

    /**
     * Returns the current cursor position in the buffer.
     * 
     * @return the index of the cursor
     */
    public int getCursorPosition() {
        return index;
    }

    /**
     * Moves the cursor one position to the left.
     * If the cursor is at the start, it does nothing.
     */
    public void moveLeft() {
        if (index > 0) {
            index--;
        }
    }

    /**
     * Moves the cursor one position to the right.
     * If the cursor is at the end, it does nothing.
     */
    public void moveRight() {
        if (index < size) {
            index++;
        }
    }

    /**
     * Returns the current size of the buffer.
     * 
     * @return the number of characters in the buffer
     */
    public int getSize() {
        return size;
    }

    /**
     * Returns the character at the specified index in the buffer.
     * 
     * @param i the index of the character to retrieve
     * @return the character at the specified index
     */
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

    /**
     * Expands the buffer's capacity by doubling it.
     * This method is called when the buffer is full and needs to accommodate more
     * characters.
     */
    private void expandBuffer() {
        int newCapacity = capacity * 2;
        char[] newArray = new char[newCapacity];
        System.arraycopy(arr, 0, newArray, 0, size);
        arr = newArray;
        capacity = newCapacity;
    }
}
