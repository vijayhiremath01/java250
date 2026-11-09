package autoBoxing;

public class que2 {

	public static void main(String[] args) {
		
		Integer a = 127;
        Integer b = 127;

        Integer c = 128;
        Integer d = 128;

        System.out.println("127 == 127: " + (a == b)); // true
        System.out.println("128 == 128: " + (c == d)); // false

        System.out.println("127 equals 127: " + a.equals(b)); // true
        System.out.println("128 equals 128: " + c.equals(d)); // true

	}

}
