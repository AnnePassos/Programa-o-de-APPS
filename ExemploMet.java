import java.util.Collection;
import java.util.ArrayList;

public class ExemploMet {
    public static void main(String[] args) {
        // Criação de um coleção de Strings
        Collection<String> nomes = new ArrayList<>(); // Adicionando o tipo genérico
        nomes.add("Anne");
        nomes.add("Tainara");
        nomes.add("Kaia");
        nomes.add("Kimi");
        nomes.add("Rave");

        // Imprimindo a lista de nomes
        System.out.println("Lista de nomes: " + nomes);
    }
}
