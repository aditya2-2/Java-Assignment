// Java program to reverse a linked list
import java.util.*;

public class ReverseLinkList
{
	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add(new String("Physics"));
		ll.add(new String("Maths"));
		ll.add(new String("Java"));
		ll.add(new String("English"));
		ll.add(new String("Chemistry"));
		System.out.println("The elements of the linked list before reversing: " + ll);
		ll = reverseLinkedList(ll);
		System.out.println("The elements of the linked list after reversing: " + ll);
    }
	public static LinkedList<String> reverseLinkedList(LinkedList<String> ll)
	{
		for (int i = 0; i < ll.size() / 2; i++) 
		{
			String temp = ll.get(i);
			ll.set(i, ll.get(ll.size() - i - 1));
			ll.set(ll.size() - i - 1, temp);
		}
		return ll;
	}
}