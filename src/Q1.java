public class Q1 {
    public static void main(String[] args) {
        int[] arr = {9, 2, 1, 4, 6};             // Cria��o do vetor (arr) �mpar desordenado

        System.out.println(averageFinder(arr));  // Foi criado um m�todo "averageFinder" para encontrar o vetor "arr"
      
    }

    public static int averageFinder(int[] numbers) {  // classe declarada fora do main para receber o vetor "arr"
        int[] arr = numbers;                         //O vetor "arr" copia o vetor "numbers"

        for (int i = 0; i < arr.length - 1; i++) {      // criado um "for" para comparar cada n�mero atribu�do no vetor e determinar o maior e o menor
            for (int j = i + 1; j < arr.length; j++) {   //linha 11: l� at� o pen�ltimo n�mero (�ndice 3 do vetor[4� elemento]),iniciando do zero || e linha 12 : iniciando do elemento seguinte
                if (arr[i] > arr[j]) {                  // Criando um "if" .Se o elemento na posi��o "i" for maior que o elemento na posi��o "j", ser� criado uma vari�vel tempor�ria "temp" que vai auxiliar na troca dos valores.           
                    int temp = arr[i]; 
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        } 
       return arr[(arr.length) / 2];          // Retorna o elemento do meio (mediana) depois do vetor j� ter sido ordenado.
    }
}