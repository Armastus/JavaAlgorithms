package HashMap;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
    public static void main(String[] args) {
        //English to Spanish Dictionary
        Map<String, String> englSpanDictionary = new HashMap<String, String>();

        // Putting things inside our dictionary.
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");

        // These gets will get all the values (spanish) with the keys (english).
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));

        // The ".keySet()" will print in all our keys.
        System.out.println((englSpanDictionary.keySet()));

        // The ".values()" will print all our values.
        System.out.println((englSpanDictionary.values()));

        // The ".size()" will print the size of our HashMap.
        System.out.println((englSpanDictionary.size()));

        System.out.println();
        System.out.println();

        // Shopping List
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();

        // Put some stuff into our Map.
        // NOTE: we can use "true, false" or "Boolean.TRUE, Boolean.FALSE".
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);

        // Get items
        System.out.println(shoppingList.get(("Ham")));
        System.out.println(shoppingList.get(("Oreos")));

        // Print Key-Value Map Pairs as a String
        System.out.println(shoppingList.toString());

        // Remove from the Map
        shoppingList.remove("Eggs");
        System.out.println(shoppingList.toString());

        // Replace value for a certain key.
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString());

        // Clear out your Map
        shoppingList.clear();
        //Print again to see that it's clear. Prints "{}".
        System.out.println(shoppingList.toString());
        // This just really points to an empty list.
        System.out.println((shoppingList.isEmpty()));
    }
}
