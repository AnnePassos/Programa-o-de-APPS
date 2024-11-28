import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Exe_vogais_dois {
    public static void main(String[] args) {
        Collection<String> vogais = new ArrayList<>();
        vogais.add("A");
        vogais.add("E");
        vogais.add("I");

        Collection<String> vogais2 = Arrays.asList("O", "U");

        vogais.addAll(vogais2);

        System.out.println("Lista das vogais: " + vogais);

    }
}
