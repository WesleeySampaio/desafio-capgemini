
public class Q2 {
    public static void main(String[] args) {
        int[] n = {1, 5, 3, 4, 2};                // Criando um array "n" com os valores pedidos na questão.

        System.out.println(diffPairFinder(n, 2));  // Chamando o método "diffPairFinder" para encontrar pares onde a diferença é igual ao valor do segundo argumento (2)
    }

    public static int diffPairFinder(int[] n, int diff) { // Criação do método fora do main
        int pairs = 0;                                    // atribuindo contador de pares começando em 0.

        for (int i = 0; i < n.length; i++) {              // Criação do "for" para comparar cada elemento do vetor
            for (int j = 0; j < n.length; j++) {
                if (n[i] - n[j] == diff) {               // Criação do "if": Informa que a posição do elemento "i" subtraindo do elemento na posição "j" é igual a diferença(diff) o contador de apres acrescenta 1
                    pairs++;
                    System.out.println("[" + n[i] + ", " + n[j] + "]");   // Imprimindo cada par
                }
            }
        }

        return pairs;  // após a impressão dos pares , retorna a quantidade de pares diferentes.
    }
}