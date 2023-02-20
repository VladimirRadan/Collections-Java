import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Text 1");
        map.put(2, "Text 1");
        map.put(3, "Text 1");
        map.put(60, "Text 1");
        map.put(10, "Text 1");
        map.put(10, "Text 5");
        map.put(10, "Text 5");

        for (Map.Entry m: map.entrySet()) {
            System.out.println("Key:" + m.getKey() + " Value: " + m.getValue());
        }

        Map<Double, Boolean> map1 = new HashMap<>();
        map1.put(3.5, true);
        map1.put(4.4, false);







    }




}
