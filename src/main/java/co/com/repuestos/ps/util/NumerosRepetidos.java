 //TODO  Ejercio 3 crear una lista con numeros repetidos "Al menos 2" y encontrarlos.


 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;

 public class NumerosRepetidos {
     public static void main(String[] args) {
         List<Integer> numbers = new ArrayList<>();
         numbers.add(3);
         numbers.add(3);
         numbers.add(8);
         numbers.add(5);
         numbers.add(2);
         numbers.add(5);

         Map<Integer, Integer> frequencyMap = new HashMap<>();

         for (int number : numbers) {
             if (frequencyMap.containsKey(number)) {
                 frequencyMap.put(number, frequencyMap.get(number) + 1);
             } else {
                 frequencyMap.put(number, 1);
             }
         }

         System.out.println("Números duplicados:");
         for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
             if (entry.getValue() > 1) {
                 System.out.println(entry.getKey());
             }
         }
     }
 }