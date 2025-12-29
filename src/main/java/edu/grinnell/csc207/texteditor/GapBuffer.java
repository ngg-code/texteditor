package edu.grinnell.csc207.texteditor;

/**
 * A gap buffer-based implementation of a text buffer.
 */
public class GapBuffer {
    
    /** The character array storing the buffer's content and gap */
    public char[] str;
    /** The index of the cursor in the buffer */
    public int indexI;
    /** The index of the end of the gap in the buffer */
    public int indexF;
    /** The current capacity of the buffer */
    public int capacity;
    /** The current size of the buffer, excluding the gap */
    public int size;

    
    /**
     * Constructs a new GapBuffer with an initial capacity.
     */
    public GapBuffer() {
        this.capacity = 10;
        this.str = new char[this.capacity];
        this.indexI = 0;
        this.indexF = 10;
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
        if (this.indexI == this.indexF) {
            expandBuffer();
        }
        str[this.indexI++] = ch;
        this.size++;
    }

    /**
     * Deletes the character before the cursor position.
     * If the cursor is at the start, it does nothing.
     */
    public void delete() {
        if (this.indexI > 0) {
            str[this.indexI - 1] = '\0';
            this.indexI--;
            this.size--;
        }
    }

    /**
     * Returns the current cursor position in the buffer.
     * 
     * @return the index of the cursor
     */
    public int getCursorPosition() {
        return this.indexI;
    }

    /**
     * Moves the cursor one position to the left.
     * If the cursor is already at the start, it does nothing.
     */
    public void moveLeft() {
        if (this.indexI > 0) {
            this.str[--this.indexF] = this.str[--this.indexI];
        }
    }

    /**
     * Moves the cursor one position to the right.
     * If the cursor is at the end of the buffer, it expands the buffer.
     */
    public void moveRight() {
        if (this.indexF < this.str.length) {
            this.str[this.indexI] = this.str[this.indexF];
            this.indexI++;
            this.indexF++;
        } else {
            expandBuffer();
        }
    }

    /**
     * Returns the current size of the buffer, excluding the gap.
     * 
     * @return the size of the buffer
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Returns the character at the specified index in the buffer.
     * 
     * @param i the index of the character to retrieve
     * @return the character at the specified index
     */
    public char getChar(int i) {
        return this.str[i];
    }

    /**
     * Returns a string representation of the buffer, excluding the gap.
     * The characters before the gap are followed by the characters after the gap.
     * 
     * @return a string representation of the buffer
     */
    public String toString() {
        int length = this.indexI + (this.str.length - this.indexF);
        char[] result = new char[length];
        int index = 0;
        if (index >= length) {
            expand(result);
        }
        for (int i = 0; i < this.indexI; i++) {
            result[index] = this.str[i];
            index++;
        }
        for (int i = this.indexF; i < this.str.length; i++) {
            result[index++] = this.str[i];
        }

        return new String(result);
    }

    /**
     * Expands the buffer to accommodate more characters.
     * It increases the size of the buffer by one and shifts the characters
     * after the gap to the right.
     */
    private void expandBuffer() {
        int newSize = this.str.length + 1;
        char[] newBuffer = new char[newSize];

        int afterTextStart = newSize - (this.str.length - this.indexF);
        System.arraycopy(this.str, 0, newBuffer, 0, this.indexI);
        System.arraycopy(
                this.str, this.indexF, newBuffer,
                afterTextStart, this.str.length - this.indexF);

        this.indexF = afterTextStart;
        this.str = newBuffer;
    }

    /**
     * Expands the result array to double its size.
     * This method is used when the result array is full and needs to be expanded.
     * 
     * @param result the character array to expand
     */
    private void expand(char[] result) {
        int newSize = result.length * 2;
        char[] newArray = new char[newSize];
        System.arraycopy(result, 0, newArray, 0, result.length);
        result = newArray;
    }
}
