package stringImmutable;

public class que1 {
	
	public static void main(String[] args) {
		String name = "vijay" ; 
		
		name.concat("hiremath");
		System.out.println("After concat without assignment: " + name);
		
		name = name.concat("hiremath");
		System.out.println("After assignment: " + name);
		
		String upper = name.toUpperCase();
		System.out.println("Original: " + name);
        System.out.println("New uppercase string: " + upper);
	}

}
