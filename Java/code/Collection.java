import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
/*1. Offers methods like sort to sort lists.
2. Provides methods like binarySearch for searching sorted lists.
3. Allows reversing the order of elements in a list with reverse.
4. Can shuffle the elements of a list randomly using shuffle.
5. Creates unmodifiable collections using methods like unmodifiableList, etc
6. Methods like singleton List, create immutable collections with a single e'
7. The copy method is used to copy all elements from one list to another*/
public class Collection {
    public static void main(String[] args) {
        List<Integer> lr=new ArrayList<>();
        lr.add(55);
        lr.add(13);
        lr.add(10);
        lr.add(5);
        System.out.println("The given list is");
        for (Integer i : lr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //sorting an array
        System.out.println("After Sorting");
        Collections.sort(lr);
        for (Integer i : lr) {
            System.out.print(i+" ");
        }
        System.out.println();
        Collections.reverse(lr);
        System.out.println(lr);
    }
}
