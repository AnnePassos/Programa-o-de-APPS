import java.util.Collection;
import java.util.ArrayList;

public class Exe_Livro {
    public static void main(String[] args) {
        Collection<String> livros = new ArrayList<>();
        livros.add("Java");
        livros.add("Php");
        livros.add("Python");
        livros.add("SQL");

        System.out.println("Listagem dos Livros: " + livros);

        livros.clear();

        System.out.println("Listagem após o clear: " + livros);
    }
}
