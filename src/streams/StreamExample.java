
  package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
  
	
	public static void main(String[] args) {
	  
	  List <String> namesList =new ArrayList<>();
	  
	  namesList.add("Rahul");
	  namesList.add("Raj");
	  namesList.add("Messi");
	  
  
  List<NameDto> users = namesList
		  .stream()
		  .map(n -> {
			  NameDto userDto = new NameDto(); 
			  userDto.setFirstName(n);
			  return userDto;
                   })
		  .collect(Collectors.toList()); 
  
  
  }
}
  
/*
 *  in above example what is n?
 *  n is every name from the stream of names
 *   
 *   and in map we can return anything but we have
 * to collect it or either use any terminal operation on the returned object n
 * is the object being passed and loop from last stream
 * 
 * 
 * 
 * 
 * 
 * 
 * N is every name from the stream of names
 * 
 * Every method has internal loop. Every object, like n, is implicitly final.
 * 
 * The object n passed to map in the example is every name, but every object
 * passed to collect is NameDto, because the stream object provided by the last
 * method (map) before collect is a stream of NameDto
 */
 