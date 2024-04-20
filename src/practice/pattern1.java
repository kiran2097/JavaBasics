package practice;

public class pattern1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}

//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class pattern1 {
//    public static void main(String[] args) {
//        List<HashMap<String, String>> data = new ArrayList<>();
//
//        // Sample data
//        for (int i = 1; i <= 5; i++) {
//            HashMap<String, String> row = new HashMap<>();
//            row.put("Name", "Item " + i);
//            row.put("Price", String.valueOf(10 + i));
//            data.add(row);
//        }
//
//        // Print the table
//        printTable(data);
//    }
//
//    public static void printTable(List<HashMap<String, String>> data) {
//        if (data.isEmpty()) {
//            System.out.println("No data to display.");
//            return;
//        }
//
//        // Determine the column headers
//        HashMap<String, Integer> columnWidths = new HashMap<>();
//        for (HashMap<String, String> row : data) {
//            for (Map.Entry<String, String> entry : row.entrySet()) {
//                String key = entry.getKey();
//                int valueLength = entry.getValue().length();
//                if (!columnWidths.containsKey(key) || valueLength > columnWidths.get(key)) {
//                    columnWidths.put(key, valueLength);
//                }
//            }
//        }
//
//        // Print the table header
//        for (String key : columnWidths.keySet()) {
//            String header = String.format("%-" + columnWidths.get(key) + "s", key);
//            System.out.print(header + " | ");
//        }
//        System.out.println();
//
//        // Print the table data
//        for (HashMap<String, String> row : data) {
//            for (String key : columnWidths.keySet()) {
//                String value = row.get(key);
//                String formattedValue = String.format("%-" + columnWidths.get(key) + "s", value);
//                System.out.print(formattedValue + " | ");
//            }
//            System.out.println();
//        }
//    }
//}
