import java.util.Scanner;              // Importando Scanner para entrada de dados pelo usu�rio

public class Q3 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);         
        System.out.print("Entrada: ");          // Entrada da frase para intera��o do usu�rio pelo Scanner
        String phrase = sc.nextLine();

        System.out.print("Sa�da: " + encrypter(phrase)); // Sa�da
    }

    public static String encrypter(String phrase) {      //Cria��o do m�todo encrypter no formato String fora do main
        String[] vect = phrase.split(" ");          // Cria��o do vetor que ir� receber apenas as palavras sem o espa�os
        String noSpaces = "";                          // Pegando o vetor de cima e juntando tudo, sem o espa�o
        for (int i = 0; i < vect.length; i++) {
            noSpaces += vect[i];
        }

        int size = noSpaces.length();                    // Cria��o da vari�vel "size" que ir� receber o tamanho da frase sem os espa�os
        int grid = 0;
        for (int i = 0; i < size; i++) {                  // criando um "for" que faz o c�lculo do grid que foi pedido em quest�o
            if (i * i > size) {
                grid = i; break;                             // utiliza��o do break para "quebrar o c�lculo" e finalizar o "for".
            }
        }

        String[][] matrix = new String[grid][grid];              // Cria��o do vetor matrix (matriz)
        int count = 0;                                           // Cria��o do contador "count" que inicia do valor 0.
        for (int i = 0; i < grid; i++) {                           
            for (int j = 0; j < grid; j++) {
                if (count < size) {                                // Cria��o do "if" que informa: se o count for menor que o size a matriz ir� receber cada letra da frase sem o espa�o
                    matrix[i][j] = String.valueOf(noSpaces.charAt(count));   // Matriz recebendo cada letra da frase 
                }
                count++;                                              //incrementa��o do contador 
            }
        }

        String encryptedMsg = "";                         //Cria��o da String encriptada vazia             
        for (int i = 0; i < grid; i++) {                   
            for (int j = 0; j < grid; j++) {
                if (matrix[j][i] == null) {              // Cria��o do "if" informando: quando o elemento for null, acrescentar� o espa�o no lugar do null
                    encryptedMsg += " ";
                } else {
                    encryptedMsg += matrix[j][i];
                    if (j == grid - 1 && matrix[j][i] != null) {  // Cria��o do "if" quando o �ltimo elemento da coluna nao for null, acrescenta um espa�o;
                        encryptedMsg += " ";
                    }
                }
            }
        }

        while (encryptedMsg.charAt(encryptedMsg.length() - 1) == ' ') {                   //Verifica se o �ltimo elemento � um espa�o
            encryptedMsg = encryptedMsg.substring(0, encryptedMsg.length() - 1);          // Caso o �ltimo elemento seja um espa�o,o espa�o ser� removido.
        }
        
        return encryptedMsg;                        // Retornando a mensagem encriptada 
    }
}