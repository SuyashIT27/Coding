import java.util.LinkedList;
import java.util.Queue;

/*1. add(E e): Inserts the specified element into the
queue. Throws an exception if the element
cannot be added.
2. offer(E e): Inserts the specified element into the
queue. Returns false if the element cannot be
added.
3. remove(): Retrieves and removes the head of the
queue. Throws an exception if the queue is
empty.
4. poll(): Retrieves and removes the head of the
queue, or returns null if the queue is empty.
        5. element(): Retrieves, but does not remove, the
head of the queue. Throws an exception if the
queue is empty.
6. peek(): Retrieves, but does not remove, the head
of the queue, or returns null if the queue is
empty.*/
public class queueInterface {
    public static void main(String[] args) {
        //Left side me interface right side me implementation.
        Queue<Integer> qe=new LinkedList<Integer>();
        qe.add(55);
        qe.add(56);
        qe.offer(47);
        qe.remove(37);
        for (Integer i : qe) {
            System.out.println(i);
        }
    }
}
