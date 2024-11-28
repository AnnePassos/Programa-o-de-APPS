public class ExemploForEach {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5 }; // vetor inteiro "numeros"
        for (int numero : numeros) {
            // Lado esquerdo: variavel : direito
            /*
             * Lado esquerdo: declara variável para armazenamento temporario
             * do valor do elemento durante a repetição
             * Lado direito: é o array/coleção que estamos percorrendo
             */
            System.out.println(numero);
        }
    }
}