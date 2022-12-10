package Java_Streams;
import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamdemo {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(8);
		num.add(3);
		num.add(5);
		num.add(19);
		num.add(10);
		num.add(11);
		num.add(13);
		System.out.println("Filtered Even numbers");
		List<Integer> lt=num.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(lt);
		System.out.println("Filtered odd numbers");
		List<Integer> lt1=num.stream().filter(n->n%2==1).collect(Collectors.toList());
		System.out.println(lt1);
		
		
		
	}

}
