package Java_Streams;
import java.util.*;
import java.util.stream.Collectors;
public class streamupdate {
	public static void main(String[] args) {
		List<Integer> up=new ArrayList<Integer>();
		up.add(34);
		up.add(32);
		up.add(55);
		up.add(31);
		up.add(32);
		
		up.forEach(System.out::println);
		System.out.println();
		List<Integer> latestmark=up.stream().map(i->i+5).collect(Collectors.toList());
		latestmark.forEach(System.out::println);
		
	}

}
