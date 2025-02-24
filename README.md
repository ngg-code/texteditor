# CSC 207: Text Editor

**Author**: Nahom Gebreegziabher

## Resources Used
- Course website:https://osera.cs.grinnell.edu/ttap/data-structures-labs/text-editor.html?search=
 * - Netbean as IDE and VS code(to commit)
 * - java 17.0.14
 * - lanterna library: https://github.com/mabe02/lanterna
 * - https://docs.oracle.com/javase/8/docs/api/overview-summary.html
 */


- The relevant input(s) to the method is the capacity of the buffer.
- The critical operation is i > index.
- A mathematical model is F(n) = n, where n is the capacity of the buffer.
- A Big-O characterization of the model s O(n) which is linear.

## Changelog
@ngg-code ➜ /workspaces/texteditor (main) $ git log
commit f077d0000530a4f69417571c04271cbb652bfd8b (HEAD -> main, origin/main, origin/HEAD)
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 05:32:17 2025 +0000

    Implement the main

commit d35a14426ab7efa13498f0030b6b989099c96a9d
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>

commit d35a14426ab7efa13498f0030b6b989099c96a9d
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 05:31:48 2025 +0000

    fix error

commit 310838c857bd7162def7a89e6fcf9e7584b6b47b
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 05:31:28 2025 +0000

    Add Author, running time analysis, Resources used.

commit e9c5570d199d3be8f3f85d22980a92fe56912ca4
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 05:17:45 2025 +0000

    initialize filePath

commit 642871fe2bc023825156982400dc8d85fa651e48
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 05:16:38 2025 +0000

    start screen

commit 155b78f4b2554a1881dfe4a1688bde1174ead351
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 05:16:06 2025 +0000

    initialize gapBuffer

commit 5da96f1465a24139dcdb2e8e6360ace21494def8
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 05:14:43 2025 +0000

    Test for GetChar

commit 8649d9703573078f94f04090b7d05e48f28cb0bb
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 05:14:01 2025 +0000

    Test for expand buffer

commit 04e3c8b52832aa076dedaec16c282dfd6349c592
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 05:13:11 2025 +0000

    Test for move cursor

commit d17cdb3829c7368154d4b2d2e73e889e0aea0ed5
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 05:12:15 2025 +0000

    Test for Delete Beyond Start

commit 6f3bfff1faa0b95fe88de46abd78feae3fa983af
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 05:11:11 2025 +0000

    Test for insert, delete, toString, getSize, getCursorPosition

commit 849955368224e7a69ae908a08026e66c28d007e6
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 04:00:34 2025 +0000

    fix error

commit 4eec67f5e566ad6ce1682e7da4d0630e82ec05b6
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 03:52:50 2025 +0000

    fix error

commit b65f484729c8c4fb67c098c195fa6f187e89d8a7
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 03:51:19 2025 +0000

    Check boundary

commit 860b9fc0c4b634edd413e1d85aab26e65613c7f3
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 03:48:27 2025 +0000

    Implement GapBuffer(text name)

commit 5ee2024c1928e8475ce9ce85fa2c7f1d42e2483f
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 03:39:52 2025 +0000

    fix error

commit 5aa88f619c37e930af5369b6fc358c40ad606fcc
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 03:35:45 2025 +0000

    fix error

commit 2631f748e51116a3396cc7199bdda85fe0db3272
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 02:22:44 2025 +0000

    Create screen object

commit 13720472a05a058effb227da86f0e79411e795ea
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 02:16:59 2025 +0000

    Create screen object

commit 490f3d161267c482cf22833a254cc6200c112e18
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 02:03:39 2025 +0000

    chaged 10 to 4

commit 8047b5d9544c1534499ff7608df0ae73404e4611
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 02:02:04 2025 +0000

    changed 3 to 10

commit 10e36cb8d8798dfff8a05378b8bbbd6fa9639324
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:57:09 2025 +0000

    Formating

commit 0b434dd485800c7c9eb900dfd4a9baa7490d1cdb
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:54:57 2025 +0000

    Imlemement expandBuffer

commit 3ab73be4072d7dc5b067d7885d09becf0155a1be
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:53:43 2025 +0000

    Implement toString

commit 1ceffc0862ef5d9476f202c14aa193a1097248e8
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:32:25 2025 +0000

    Implement getChar

commit 09494e516dc64f6013ef7b68a654f9f0ee719ddf
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:31:13 2025 +0000

    Implement getSize

commit 94cd69351480f0f1f5e4111c50b281a2d35b45b5
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:30:14 2025 +0000

    Implement moveRight

commit 997b1e314395b6fd3bf4bb077a62a94ea741333f
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:29:40 2025 +0000

    Implement moveLeft

commit cff9ddf2c20906f950d880b85510f8ca814af22c
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:29:02 2025 +0000

    Implement getCursorPosition

commit 2f23c9dfd020f56fb5945ac21173d2f22424cef2
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:28:26 2025 +0000

    Implement delete

commit 2779c8c8ed909cfe7d6c1e6f6649d5784addd7d1
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:27:45 2025 +0000

    Implement insert

commit 4cd135135d4df0d8632b4d11bbe25e0447fbe444
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:26:36 2025 +0000

    Implement GapBuffer constractor

commit 59afd92436f09bcfa43ed2920316a7e88084395e
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:25:10 2025 +0000

    Test for expandBuffer

commit 57967bf83fb95cee03993f71e0c36c475fc54a30
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:24:19 2025 +0000

    Test for moveCursor

commit 55e45de61abb583610e6a0b484c348363b113b49
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:23:16 2025 +0000

    Test for delete

commit c411d921d53b672505a55ee3ef97ad0764673c75
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:20:12 2025 +0000

    Test for insert, toString, getCursorPosition, getSize, getChar

commit 52e3918a64f1e04e522ea54eac8070236eafddef
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:18:53 2025 +0000

    Add libraries for test and assert

commit 7d624992560d9d68f7c6889fc225078c4cbcc0e9
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:17:02 2025 +0000

    Implement expandBuffer Method

commit 5ae3917fc884786569c90bdfe3bfb756a4ed4127
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:16:06 2025 +0000

    Implement toString

commit 1595c07aeba31716c460d900837081bc7915d64e
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:15:21 2025 +0000

    Implement getChar method

commit edb84358ed5efc8fb828cb5f0c41ea7d9b372623
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:14:28 2025 +0000

    Implement getSize method

commit d4266e0a8382fec614236bddcda406237f541274
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:13:49 2025 +0000

    Implement moveRight

commit 01385d452e2bb3f13f2e95b132210096a1ac82b8
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:13:19 2025 +0000

    Implement moveLeft

commit f61912d666d9304d86d29ff4c49a318a5da852e5
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:12:41 2025 +0000

    Implement getCursorPosition

commit 0e36a355679aa7390d0f1f5792dc538a9d6eb2a5
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:12:02 2025 +0000

    Implement delete method

commit 7f8adc8037d8ed3a03a550d7e6d572a4e9a43d39
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:11:16 2025 +0000

    Implement insert method

commit 67e1a96a515bae57d2a58ba601dcd5b9d70c7c58
Author: ngg-code <157342451+ngg-code@users.noreply.github.com>
Date:   Mon Feb 24 01:09:37 2025 +0000

    Add SimpleStringBuffer Constructer

commit 32a90495f40bd92ce905d4d78fbdab4dbaa6d5f9
Author: Peter-Michael Osera <osera@cs.grinnell.edu>
Date:   Thu Feb 13 12:40:05 2025 -0600

    Project files

commit 02dc92144ecc088bcefb4a9798df0934efe300c1
Author: Peter-Michael Osera <osera@cs.grinnell.edu>
Date:   Thu Feb 13 12:39:53 2025 -0600

    initial commit
(END)