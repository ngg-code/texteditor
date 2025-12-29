package edu.grinnell.csc207.texteditor;

import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.screen.Screen;
import java.io.IOException;
import java.nio.file.*;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;

/**
 * The driver for the TextEditor Application.
 */
public class TextEditor {

    /**
     * The main entry point for the TextEditor application.
     * 
     * @param args command-line arguments.
     */
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java TextEditor <filename>");
            System.exit(1);
        }

        GapBuffer gapBuffer = new GapBuffer();

        Screen screen = new DefaultTerminalFactory().createScreen();
        screen.startScreen();
        String path = args[0];
        System.out.format("Loading %s...\n", path);
        Path filePath = Paths.get(path);

        if (Files.exists(filePath) && Files.isRegularFile(filePath)) {
            String gapBufferStr = Files.readString(filePath);
            for (int i = 0; i < gapBufferStr.length(); i++) {
                gapBuffer.insert(gapBufferStr.charAt(i));
            }
        }

        boolean isRunning = true;
        {

            while (isRunning) {
                drawBuffer(gapBuffer, screen);
                KeyStroke stroke = screen.readInput();

                if (stroke.getKeyType() == KeyType.Character) {
                    gapBuffer.insert(stroke.getCharacter());
                }

                if (stroke.getKeyType() == KeyType.Backspace) {
                    gapBuffer.delete();
                }

                if (stroke.getKeyType() == KeyType.ArrowLeft) {
                    gapBuffer.moveLeft();
                }

                if (stroke.getKeyType() == KeyType.ArrowRight) {
                    gapBuffer.moveRight();
                }

                if (stroke.getKeyType() == KeyType.Escape) {
                    screen.stopScreen();
                    isRunning = false;
                }
            }

            Files.writeString(filePath, gapBuffer.toString());
        }
    }

    /**
     * Draws the contents of the GapBuffer to the screen.
     * 
     * @param gapBuffer the GapBuffer containing the text to display.
     * @param screen    the Screen object to draw on.
     * @throws IOException if there is an error writing to the screen.
     */
    private static void drawBuffer(GapBuffer gapBuffer, Screen screen) throws IOException {
        screen.clear();

        String content = gapBuffer.toString();

        for (int i = 0; i < content.length(); i++) {
            screen.setCharacter(
                    new TerminalPosition(i, 0),
                    new TextCharacter(content.charAt(i),
                            TextColor.ANSI.DEFAULT, TextColor.ANSI.DEFAULT));
        }

        screen.setCursorPosition(new TerminalPosition(gapBuffer.getCursorPosition(), 0));

        screen.refresh();
    }
}