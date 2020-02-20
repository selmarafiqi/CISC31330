/* Class: CISC 3130
 * Section: TY2
 * EmplId: 23593485
 * Name: Selma Rafiqi
 */

import java.io.*;
import java.util.*;

public class artists {

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        int lineNumber = 0;
    //Calling the file
        File csvFile = new File("csvFiles.csv");
        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        String line = "";
    //while the line being read in not null...
        while ((line = br.readLine()) != null) {
    //split the commas
            String[] arr = line.split(",");
    //add the second column into new array
            list.add(arr[2]);
            lineNumber++;
        }
    //sort the new array
        Collections.sort(list);
    //print out column/new array
        list.forEach(i -> System.out.println(i));
    }
}
