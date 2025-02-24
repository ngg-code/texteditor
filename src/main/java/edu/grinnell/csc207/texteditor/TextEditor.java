package edu.grinnell.csc207.texteditor;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.screen.Screen;
import java.io.IOException;
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
    }
}
