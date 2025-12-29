# CSC 207: Text Editor

This is a text editor using two different buffer data structures: **GapBuffer** 
and **SimpleStringBuffer**.

**Author**: Nahom Gebreegziabher

## Resources Used
- Course website:https://osera.cs.grinnell.edu/ttap/data-structures-labs/text-editor.html?search=
 * - Netbean as IDE and VS code(to commit)
 * - java 17.0.14
 * - lanterna library: https://github.com/mabe02/lanterna
 * - https://docs.oracle.com/javase/8/docs/api/overview-summary.html
 */

 ### Core Implementation
- **`GapBuffer.java`**  
  Implements a gap buffer data structure optimized for efficient insertions and deletions near the cursor.

- **`SimpleStringBuffer.java`**  
  Implements a basic string-based buffer used as a baseline for comparison.

- **`TextEditor.java`**  
  Provides the text editor interface and integrates buffer implementations to support common editing operations.

  ### Testing
- **`GapBufferTests.java`**  
  Unit tests validating correctness, edge cases, and expected behavior of the `GapBuffer`.

- **`SimpleStringBufferTests.java`**  
  Unit tests ensuring correctness of the `SimpleStringBuffer` implementation.

  ## Features

- Cursor-based text insertion and deletion
- Multiple buffer implementations interchangeable within the editor
- Unit tests for all core data structures
- Clear separation between editor logic and buffer storage

## How to Run

**`Prerequisites`**
Java 17+ and Maven installed.

**`Run tests`**
Run the unit tests:
mvn test

**`Run the interactive editor`**
Create or pick a file (example):
printf "Hello\nThis is a demo.\n" > /tmp/demo.txt

Run the editor (replace the path):
mvn exec:java -Dexec.mainClass="edu.grinnell.csc207.texteditor.TextEditor" -Dexec.args="/tmp/demo.txt"



