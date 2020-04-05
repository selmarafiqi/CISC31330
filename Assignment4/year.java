import java.io.*;
import java.util.*;

public class year {

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
            String year = arr[1].substring(arr[1].length()-6);

            int count;
            if (map.containsKey(year)) {
                count = map.get(year) + 1;
            }
            else {
                count = 1;
            }
            // add the second column into new array

            // System.out.println(year);
            map.put(year, count);
        }

        //will sort by count and prints out each element in array
        LinkedHashMap < String, Integer > reverseSortedMap = new LinkedHashMap < > ();
        map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

            reverseSortedMap.forEach((key, value) -> System.out.println(key + ":" + value));

    }

}