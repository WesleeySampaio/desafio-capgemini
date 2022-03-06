
public class Q2 {
    public static void main(String[] args) {
        int[] n = {1, 5, 3, 4, 2};                // Criando um array "n" com os valores pedidos na quest�o.

        System.out.println(diffPairFinder(n, 2));  // Chamando o m�todo "diffPairFinder" para encontrar pares onde a diferen�a � igual ao valor do segundo argumento (2)
    }

    public static int diffPairFinder(int[] n, int diff) { // Cria��o do m�todo fora do main
        int pairs = 0;                                    // atribuindo contador de pares come�ando em 0.

        for (int i = 0; i < n.length; i++) {              // Cria��o do "for" para comparar cada elemento do vetor
            for (int j = 0; j < n.length; j++) {
                if (n[i] - n[j] == diff) {               // Cria��o do "if": Informa que a posi��o do elemento "i" subtraindo do elemento na posi��o "j" � igual a diferen�a(diff) o contador de apres acrescenta 1
                    pairs++;
                    System.out.println("[" + n[i] + ", " + n[j] + "]");   // Imprimindo cada par
                }
            }
        }

        return pairs;  // ap�s a impress�o dos pares , retorna a quantidade de pares diferentes.
    }
}