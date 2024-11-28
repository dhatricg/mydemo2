package cg.com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Testing {

	public static void main(String[] args) {
		ArrayList<String> member = new ArrayList<>();
		
		member.add("Plex");
		member.add("Martin");
		member.add("Dhatri");
		member.add("preeti");
		
		member.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).sorted().forEach(System.out::println);
		
		//member.stream().map(String::toUpperCase);
		
		//member.stream().sorted();
		
		//member.stream().forEach(System.out::println);
		
	    boolean result = member.stream().anyMatch((s)->s.startsWith("A"));
	    System.out.println(result);
		
	    List<String> newlist = member.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
	    System.out.println(newlist);
	    
	    long count = member.stream().filter((s)->s.startsWith("A")).count();
	    System.out.println(count);
	    
	    boolean res = member.stream().allMatch((s)->s.startsWith("A"));
	    System.out.println(res);
	    
	    boolean r = member.stream().noneMatch((s)->s.startsWith("A"));
	    System.out.println(r);
	    
	    //collect is a terminal operation
		//map is used to transform the data
	    
	    List<Integer> num = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4);
	    num.stream().distinct().forEach(System.out::println);
        
	}

}
