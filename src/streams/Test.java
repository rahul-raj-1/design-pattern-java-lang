/*
 * package streams;
 * 
 * public class Test {
 * 
 * 
 * List<UserDto> users = names.stream().map(n -> { UserDto userDto = new
 * UserDto(); userDto.setName(n); return userDto;
 * }).collect(Collectors.toList()); }
 * 
 * 
 * ok in above example what is n and in map we can return anything but we have
 * to collect it or either use any terminal operation on the returned object
 * n is the object being passed and loop from last stream
 * 
 * oh ok




N is every name from the stream of names

Every method has internal loop. Every object, like n, is implicitly final.

The object n passed to map in the example is every name, but every object passed to collect is UserDto,
 because the stream object provided by the last method (map) before collect is a stream of UserDto
 *  	
 */