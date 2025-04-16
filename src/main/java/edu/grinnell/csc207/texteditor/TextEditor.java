package edu.grinnell.csc207.texteditor;

import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.screen.Screen;
import java.io.IOException;
import java.nio.file.*;

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
    

    boolean isRunning = true;{

    while(isRunning)
    {
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

    Files.writeString(filePath,gapBuffer.toString());
}
}

    private static void drawBuffer(GapBuffer gapBuffer, Screen screen) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'drawBuffer'");
    }
}
