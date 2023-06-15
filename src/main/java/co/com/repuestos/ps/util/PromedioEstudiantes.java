import java.util.HashMap;
import java.util.Map;

public class PromedioEstudiantes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();


        notas.put("Cristian", 5);
        notas.put("Angelica", 10);
        notas.put("Claudia", 8);
        notas.put("Juan Carlos", 9);

        int notaAngelica = notas.get("Angelica");
        System.out.println("La nota de Angelica es: " + notaAngelica);

        int total = 0;
        int mejorNota = Integer.MIN_VALUE;
        int bajaNota = Integer.MAX_VALUE;

        for (int nota : notas.values()) {
            total += nota;

            if (nota > mejorNota) {
                mejorNota = nota;
            }

            if (nota < bajaNota) {
                bajaNota = nota;
            }
        }

        double promedio = (double) total / notas.size();
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("La mejor nota es: " + mejorNota);
        System.out.println("La nota más baja es: " + bajaNota);
    }
}





