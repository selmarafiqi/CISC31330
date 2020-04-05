import java.io.*;
import java.util.*;

public class main {

    public static void main(String[] args) throws IOException {

        Map < String, Integer > map = new HashMap < > ();
        // Calling the file
        File csvFile = new File("movies.csv");
        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        String line = "";

        // while the line being read in not null...
        while ((line = br.readLine()) != null) {
            // split the commas
            String[] arr = line.split(",");
            int count;
            if (map.containsKey(arr[2])) {
                count = map.get(arr[2]) + 1;
            }
            else {
                count = 1;
            }
            // add the third column into new array
            map.put(arr[2], count);
        }

        LinkedHashMap < String, Integer > reverseSortedMap = new LinkedHashMap < > ();
        map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

            reverseSortedMap.forEach((key, value) -> System.out.println(key + ":" + value));

    }

}