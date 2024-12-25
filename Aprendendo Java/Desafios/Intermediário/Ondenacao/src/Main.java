public class Main {
    public static void main(String[] args) {
        int vetor[] = {5, 1, 12, 3, 6};
        int tamanho = vetor.length;
        for (int i = 0; i <= tamanho - 1; i++) {
            for(int j=i+1; j<tamanho;j++){
                if(vetor[i] > vetor[j]){
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        for(int i=0; i<tamanho; i++){
            System.out.println(vetor[i]);
        }
    }
}