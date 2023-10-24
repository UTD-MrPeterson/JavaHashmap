package edu.utdallas.peterson;

import java.util.HashMap;

public class HashMapExample {

    private static final int ONE_TWO_THREE = 123;
    private static final int FOUR_FIVE_SIX = 456;
    private static final String OTHER_PROF = "Your Other Professor";

    public static void main(String[] args) {
        HashMap<Integer, String> intToString = new HashMap<>();
        intToString.put(ONE_TWO_THREE, "Mr. Peterson");
        intToString.put(FOUR_FIVE_SIX, OTHER_PROF);

        if ( intToString.containsKey(ONE_TWO_THREE)) {
            System.out.println("As expected: " + ONE_TWO_THREE);
            System.out.println("   " + intToString.get(ONE_TWO_THREE));
        }

        if ( intToString.containsKey(334553)) {
            System.out.println("Really? " + intToString.get(334553));
        }

        if ( intToString.containsValue("No one")) {
            System.out.println("Really? No one?");
        }

        if ( intToString.containsValue(OTHER_PROF)) {
            System.out.println("As expected, " + OTHER_PROF);
        }
    }
}
