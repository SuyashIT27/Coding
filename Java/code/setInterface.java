import java.util.HashSet;
import java.util.Set;

public class setInterface {
    public static void main(String[] args) {
        Set<Integer> sr=new HashSet<>();
        sr.add(1);
        sr.add(2);
        sr.add(4);
        sr.add(-1);
        //In set we cannot add the same element.
//        sr.add(1);
        // In set the order is not fixed.
        System.out.println(sr);


    }
}
