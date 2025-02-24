package edu.grinnell.csc207.texteditor;

/**
 * A gap buffer-based implementation of a text buffer.
 */
public class GapBuffer {
    public char[] str;
    public int indexI;
    public int indexF;
    public int capacity =10;
    public int size;

    public GapBuffer(int capacity, int indexI, int indexF){
        this.capacity = 10;
        char[] str = new char[this.size];
        this.indexI = 0;
        this.indexF = 3;
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
        this.indexI--;
        this.size--;
    }

    public int getCursorPosition() {
        return this.indexI;
    }

    public void moveLeft() {
        if (this.indexI > 0) {
            this.str[this.indexF] = this.str[this.indexI];
        }
    }

    public void moveRight() {
        if (this.indexF < this.str.length) {
            this.str[this.indexI++] = this.str[this.indexF++];
        }
    }

    public int getSize() {
        throw new UnsupportedOperationException("Unimplemented method 'getSize'");
    }

    public char getChar(int i) {
        throw new UnsupportedOperationException("Unimplemented method 'getChar'");
    }

    public String toString() {
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
}
