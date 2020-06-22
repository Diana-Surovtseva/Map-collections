import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> myMap = new HashMap<>();
        myMap.put("OP12345", new Student ("Diana"));
        myMap.put("DL54321", new Student("Katy"));
        myMap.put("LK98745", new Student("Ruslan"));
        System.out.println(myMap);
    }
}
