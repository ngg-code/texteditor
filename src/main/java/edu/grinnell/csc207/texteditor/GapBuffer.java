package edu.grinnell.csc207.texteditor;

/**
 * A gap buffer-based implementation of a text buffer.
 */
public class GapBuffer {
    public char[] str;
    public int indexI;
    public int indexF;
    public int capacity = 10;
    public int size;

    public GapBuffer() {
        this.capacity = 10;
        this.str = new char[this.capacity];
        this.indexI = 0;
        this.indexF = 4;
        this.size = 0;
    }

    public void insert(char ch) {
        if (this.indexI == this.indexF) {
            expandBuffer();
        }
        str[this.indexI] = ch;
        this.indexI++;
        this.size++;
    }

    public void delete() {
        if (this.indexI > 0) {
            this.indexI--;
            this.size--;
        }
    }

    public int getCursorPosition() {
        return this.indexI;
    }

    public void moveLeft() {
        if (this.indexI > 0) {
            this.str[--this.indexF] = this.str[--this.indexI];
        }
    }

    public void moveRight() {
        if (this.indexF < this.str.length) {
            this.str[this.indexI++] = this.str[this.indexF++];
        }
    }

    public int getSize() {
        return this.size;
    }

    public char getChar(int i) {
        return this.str[i];
    }

    public String toString() {
        char[] result = new char[this.indexI + (this.str.length - this.indexF)];
        int index = 0;

        for (int i = 0; i < this.indexI; i++) {
            result[index++] = this.str[i];
        }
        for (int i = this.indexF; i < this.str.length; i++) {
            result[index++] = this.str[i];
        }

        return new String(result);
    }

    private void expandBuffer() {
        int newSize = this.str.length * 2;
        char[] newBuffer = new char[newSize];

        int afterTextStart = newSize - (this.str.length - this.indexF);
        System.arraycopy(this.str, 0, newBuffer, 0, this.indexI);
        System.arraycopy(this.str, this.indexF, newBuffer, afterTextStart, this.str.length - this.indexF);

        this.indexF = afterTextStart;
        this.str = newBuffer;
    }
}
