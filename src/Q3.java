import java.util.Scanner;              // Importando Scanner para entrada de dados pelo usuário

public class Q3 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);         
        System.out.print("Entrada: ");          // Entrada da frase para interação do usuário pelo Scanner
        String phrase = sc.nextLine();

        System.out.print("Saída: " + encrypter(phrase)); // Saída
    }

    public static String encrypter(String phrase) {      //Criação do método encrypter no formato String fora do main
        String[] vect = phrase.split(" ");          // Criação do vetor que irá receber apenas as palavras sem o espaços
        String noSpaces = "";                          // Pegando o vetor de cima e juntando tudo, sem o espaço
        for (int i = 0; i < vect.length; i++) {
            noSpaces += vect[i];
        }

        int size = noSpaces.length();                    // Criação da variável "size" que irá receber o tamanho da frase sem os espaços
        int grid = 0;
        for (int i = 0; i < size; i++) {                  // criando um "for" que faz o cálculo do grid que foi pedido em questão
            if (i * i > size) {
                grid = i; break;                             // utilização do break para "quebrar o cálculo" e finalizar o "for".
            }
        }

        String[][] matrix = new String[grid][grid];              // Criação do vetor matrix (matriz)
        int count = 0;                                           // Criação do contador "count" que inicia do valor 0.
        for (int i = 0; i < grid; i++) {                           
            for (int j = 0; j < grid; j++) {
                if (count < size) {                                // Criação do "if" que informa: se o count for menor que o size a matriz irá receber cada letra da frase sem o espaço
                    matrix[i][j] = String.valueOf(noSpaces.charAt(count));   // Matriz recebendo cada letra da frase 
                }
                count++;                                              //incrementação do contador 
            }
        }

        String encryptedMsg = "";                         //Criação da String encriptada vazia             
        for (int i = 0; i < grid; i++) {                   
            for (int j = 0; j < grid; j++) {
                if (matrix[j][i] == null) {              // Criação do "if" informando: quando o elemento for null, acrescentará o espaço no lugar do null
                    encryptedMsg += " ";
                } else {
                    encryptedMsg += matrix[j][i];
                    if (j == grid - 1 && matrix[j][i] != null) {  // Criação do "if" quando o último elemento da coluna nao for null, acrescenta um espaço;
                        encryptedMsg += " ";
                    }
                }
            }
        }

        while (encryptedMsg.charAt(encryptedMsg.length() - 1) == ' ') {                   //Verifica se o último elemento é um espaço
            encryptedMsg = encryptedMsg.substring(0, encryptedMsg.length() - 1);          // Caso o último elemento seja um espaço,o espaço será removido.
        }
        
        return encryptedMsg;                        // Retornando a mensagem encriptada 
    }
}