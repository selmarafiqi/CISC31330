/* Class: CISC 3130
 * Section: TY2
 * EmplId: 23593485
 * Name: Selma Rafiqi
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(final String[] args) {

        // gets files from directory
        final File directory = new File("C:/csvfiles");
        final File[] list = directory.listFiles();

        try {
            printContents(list);

        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    // this method will retrieve the song names and sort them from each file.
    public static void printContents(final File[] list) throws IOException {
        final Stack<String> STACK = new Stack<String>(); 

        int lineNumber = 0;

        // retrieving song from files
        for (int i = 0; i < list.length; i++) {
            final String filename = list[i].getPath();
            System.out.println(filename);
            final BufferedReader br = new BufferedReader(new FileReader(filename));

            String line = null;
            while ((line = br.readLine()) != null) {
                final String[] arr = line.split(",");
                // removes duplictaes
                if (STACK.contains(arr[1])) {
                    continue;
                } else {
                    STACK.push(arr[1]);
                    lineNumber++;
                }
            }

        }

        // sorts stack

        Collections.sort(STACK);

        // prints stack
        STACK.forEach(i -> System.out.println(i));

        System.out.println("===========================================================");
        //prints the last song in playlist
        System.out. println("This is the last song you listened to: " +STACK.peek());

    }

}
