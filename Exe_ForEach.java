import java.util.Arrays;
import java.util.List;

public class Exe_ForEach {
    public static void main(String[] args) {
        // Criação da lista de frutas
        List<String> frutas = Arrays.asList("Maçã", "Banana", "Laranja");

        // Uso do forEach para imprimir cad fruta
        frutas.forEach(fruta -> System.out.println(fruta));
    }
}
