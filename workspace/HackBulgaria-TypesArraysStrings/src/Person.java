
public class Person { // Classes define set of attributes represented by variables and properties and set of behaviors represented by methods.
	
	public String name; // attribute; keyword "public" is an access modifier
	
	public String EGN; // attribute
	
	public int age; // attribute
	
	public String sayHello() { // method = member function 
		return "Hello from" + this.name; // "this" allows a method defined in one class to invoke another method that is defined later, in some subclass thereof
	}
	
	public boolean hasAccess() { // method = member function
		if (age > 18) {
			return true;
		}
		System.out.println("@@@@");
		return false;
	}

	public static void main(String[] args) { // The return type "void" indicates that this method will perform a task but will not return any information to its calling method.
											// main is a static method
		Person mariya = new Person(); // "new creates a new object of the class specified to the right of the keyword; the parentheses in combination with a class name represent a call to a constructor
		mariya.name = "Mariya Miteva";
		mariya.EGN = "856978413";
		mariya.age = 20;
		
		if (mariya.hasAccess()) {    // call Person's hasAccess method
			System.out.println("Mariya is above 18.");
		}
		

	}

}
