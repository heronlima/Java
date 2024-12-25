import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite uma palavra: ");
        Scanner read = new Scanner(System.in);
        String palavra = read.nextLine();
        System.out.println(palavra);
        char busca[] = palavra.toCharArray();
        int tamanho = palavra.length();
        tamanho--;
        boolean isPalindrome = false;
        for(int i = 0; i<=tamanho; i++){
            System.out.println(busca[i]+"--"+busca[tamanho-i]);
            if(busca[i] == busca[tamanho-i]){
                isPalindrome = true;
            }
            else{
                isPalindrome = false;
            }
        }
        if(isPalindrome){
            System.out.println("é palindromo");
        }
        else{
            System.out.println("nao é palindromo");
        }
    }
}
/* Qual foi a logica? extrair a String em um Char / vetor, percorrer o vetor normal e ao contrário comparando suas posiçoes*/