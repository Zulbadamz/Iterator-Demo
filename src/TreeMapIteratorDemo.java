import java.util.*;

public class TreeMapIteratorDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> temperatures = new TreeMap<>();
        temperatures.put("January", 32.5);
        temperatures.put("February", 35.2);
        temperatures.put("March", 45.8);
        temperatures.put("April", 55.0);
        temperatures.put("May", 65.3);
        temperatures.put("June", 75.4);

        System.out.println("Temperature Data: " + temperatures);

        // Finding highest and lowest temperatures
        Iterator<Map.Entry<String, Double>> iterator = temperatures.entrySet().iterator();
        Map.Entry<String, Double> coldest = iterator.next();
        Map.Entry<String, Double> hottest = coldest;

        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            if (entry.getValue() < coldest.getValue()) {
                coldest = entry;
            }
            if (entry.getValue() > hottest.getValue()) {
                hottest = entry;
            }
        }

        System.out.println("Coldest Month: " + coldest.getKey() + " (" + coldest.getValue() + "°F)");
        System.out.println("Hottest Month: " + hottest.getKey() + " (" + hottest.getValue() + "°F)");
    }
}

