import java.util.ArrayList;

//1. An ordered collection (also known as a sequence).
//        2. Allows duplicate elements.
//3. Elements can be accessed by their integer index.
//        4. Maintains the insertion order of elements.
//        5. Performance: Offers fast random access and quick iteration.
//6. Capacity: Grows automatically as elements are added.
//        7. Preferred over arrays when the size is dynamic or unknown.
public class listInterface {
    public static void main(String[] args) {
      ArrayList<String> arr=new ArrayList<>();
      arr.add("Hello");
      arr.add("my");
      arr.add("name");
      arr.add("is");
      arr.add("Suyash Verma");
        System.out.println(arr);
        try {
            System.out.println(arr.get(4));
        }catch(IndexOutOfBoundsException ex){
            System.out.println("You have search fot the length greater than arraysize.");
            System.out.println(ex.getMessage());
        }
        arr.set(4,"Kajal");
        System.out.println(arr.get(4));

    }
}
