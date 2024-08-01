package maven_demo.acc.maven;

/**
 * Hello world!
 *
 */
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        SortedMap<String, String> marketProjects = new TreeMap<String, String>();
        
        // Add some market-project mappings
        marketProjects.put("US", "Project A");
        marketProjects.put("EUROPE", "Project B");
        marketProjects.put("ASIA", "Project C");

        // Display the mappings
        for (Entry<String, String> market : marketProjects.entrySet()) {
            System.out.println("Market: " + market.getKey() + ", Project: " + market.getValue());
        }
    }
}