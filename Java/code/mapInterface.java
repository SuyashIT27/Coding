import java.util.HashMap;
import java.util.Map;

/*1. Stores data as key-value pairs.
2. Each key can map to at most one value.
3. Keys are unique, but multiple keys can map to the same value.
4. It is part of the Collections Framework but does not extend the
Collection interface.*/
public class mapInterface {
    public static void main(String[] args) {
        Map<String,Integer> sr=new HashMap<>();
        sr.put("Suyash",85);
        sr.put("kajal",95);
        System.out.println(sr.size());
        System.out.println(sr);
        // If no key is found then null is returned.
        System.out.println(sr.get("Suyash"));
    }
}
