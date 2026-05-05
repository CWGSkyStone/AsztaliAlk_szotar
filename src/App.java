import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Initialize...");
        Map<String, String> szotar = new HashMap<>();
        szotar.put("Alma", "Apple");
        szotar.put("Szék", "Chair");
        szotar.put("Asztal", "Table");
        System.out.println(szotar.size());
        System.out.println(szotar.get("Szék"));
        // szotar.clear();
        // System.out.println(szotar.size());
        System.out.println(szotar.containsKey("Asztal"));
        System.out.println(szotar.remove("Szék"));
        for(Map.Entry<String, String> entry : szotar.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
