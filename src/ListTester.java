import java.util.*;
import java.io.*;
public class ListTester
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(new File("input.txt"));

        LinkedList ll = new LinkedList();

        for(int i = 0; i < 5; i++)
            ll.add(new Actor(sc.nextLine()));

        //ll.remove(new Actor("David"));

        for(int i = 0; i < ll.size(); i++)
        {
            System.out.println(ll.get(i));
        }

        System.out.println(ll);

        System.out.println("\n" + ((Actor)ll.get(0)).getName());
    }
}
