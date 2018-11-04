import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("Apple","Banana","cat","Dog");
		printFP(list);
		
	String randomName = "Mike";
	int x = 2;
	HelloService helloService = (firstname,lastname) -> {
		
		String hello = "Hello " + firstname + lastname;
		return hello;
	};
	
	AddNumbers addNumbers = (int a,int b) -> {
		//Same scope as enclosing scope
		//can use variables from enclosing scope
		int sum = a+ b+x;
		System.out.println("This function will run");
		return sum;
	};
	
	SomethingVoid somethingVoid = () -> {
		System.out.println("Just a simple printout");
		throw new Exception();
		
	};
	
	System.out.println(helloService.hello("JianWei,", "Huang"));
	int someSum = addNumbers.addTwoNumber(12, 13);
	int addition = someSum + 3;
	System.out.println(addition);
	System.out.println(someSum);
	try {
	somethingVoid.doNothing();
	}
	catch(Exception e) {
		
	}
	}
	
	interface SomethingVoid{
	void doNothing() throws Exception;
	}
	
	interface HelloService{
		String hello(String firstName,String lastName);
	}
	
	interface AddNumbers{
		int addTwoNumber(int a, int b);
	}
	private static void printFP(List<String> list) {
		
		list.stream().forEach(
				
				something->System.out.println("Element -" + something)
				
				);
	}

}
