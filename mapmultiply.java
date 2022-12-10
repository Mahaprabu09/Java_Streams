package Java_Streams;
import java.util.*;
import java.util.stream.Collectors;
public class mapmultiply {
	public static void main(String[] args) { 
		  ArrayList<Integer> l=new ArrayList<Integer>(); 
		  l.add(8); 
		  l.add(5); 
		  l.add(3); 
		  l.forEach(System.out::println); 
		  List<Integer> cube=l.stream().map(i->i*i*i).collect(Collectors.toList()); 
		  System.out.println("after adding the value of i"); 
		  cube.forEach(System.out::println);
		  }

}