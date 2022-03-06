public class Q1 {
    public static void main(String[] args) {
        int[] arr = {9, 2, 1, 4, 6};             // Criação do vetor (arr) ímpar desordenado

        System.out.println(averageFinder(arr));  // Foi criado um método "averageFinder" para encontrar o vetor "arr"
      
    }

    public static int averageFinder(int[] numbers) {  // classe declarada fora do main para receber o vetor "arr"
        int[] arr = numbers;                         //O vetor "arr" copia o vetor "numbers"

        for (int i = 0; i < arr.length - 1; i++) {      // criado um "for" para comparar cada número atribuído no vetor e determinar o maior e o menor
            for (int j = i + 1; j < arr.length; j++) {   //linha 11: lê até o penúltimo número (índice 3 do vetor[4º elemento]),iniciando do zero || e linha 12 : iniciando do elemento seguinte
                if (arr[i] > arr[j]) {                  // Criando um "if" .Se o elemento na posição "i" for maior que o elemento na posição "j", será criado uma variável temporária "temp" que vai auxiliar na troca dos valores.           
                    int temp = arr[i]; 
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        } 
       return arr[(arr.length) / 2];          // Retorna o elemento do meio (mediana) depois do vetor já ter sido ordenado.
    }
}