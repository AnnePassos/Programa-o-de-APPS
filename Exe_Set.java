import java.util.HashSet;
import java.util.Set;

public class Exe_Set {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Banana"); // Duplicata ignorada

        System.out.println("Frutas no conjunto : " + frutas); // Ordem não garantida
    }
}