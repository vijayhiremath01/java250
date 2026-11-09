
package autoBoxing;

/**
 * Demonstrates Autoboxing and Unboxing in Java.
 *
 * Autoboxing: Conversion of a primitive type into its
 * corresponding wrapper class object.
 *
 * Unboxing: Conversion of a wrapper class object back
 * into its corresponding primitive type.
 *
 * @author vijayhiremath01 
 */
public class que1 {

    public static void main(String[] args) {

        /**
         * Autoboxing:
         * Automatically converts primitive int into Integer.
         */
        int pmNumber = 25;
        Integer boxedNumber = pmNumber;

        /**
         * Unboxing:
         * Automatically converts Integer object into primitive int.
         */
        int convertedBack = boxedNumber;

        // Display the primitive value.
        System.out.println("Primitive: " + pmNumber);

        // Display the boxed Integer object.
        System.out.println("Boxed: " + boxedNumber);

        // Display the unboxed primitive value.
        System.out.println("Unboxed: " + convertedBack);

        /**
         * Creating an ArrayList that stores Integer objects.
         *
         * Collections in Java store objects rather than primitive types.
         */
        java.util.List<Integer> numbers =
                new java.util.ArrayList<Integer>();

        /**
         * Autoboxing occurs automatically when primitive int values
         * are added to the Integer collection.
         */
        numbers.add(1);
        numbers.add(2);

        /**
         * Unboxing occurs automatically when retrieving an Integer
         * object and assigning it to a primitive int variable.
         */
        int first = numbers.get(0);

        // Display the first element retrieved from the collection.
        System.out.println("First number: " + first);
    }
}
