import java.util.ArrayList;
import java.util.Collection;

public class Exe_vogais_tres {
    public static void main(String[] args) {
        Collection<String> vogais = new ArrayList<>();
        vogais.add("A");
        vogais.add("E");
        vogais.add("I");
        vogais.add("O");
        vogais.add("U");

        for (String vog : vogais) {
            System.out.println("Vogal: " + vog);
        }
    }
}
