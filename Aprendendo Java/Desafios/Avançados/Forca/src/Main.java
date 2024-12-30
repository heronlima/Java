import java.util.Random;
import java.util.Scanner;

//Descobrir como parar o while


public class Main {
    public static void main(String[] args) {
        //random palavra para jogar!
        String [] itens = {"amanha", "ate", "amadurecer", "amado", "amor"};
        int index = new Random().nextInt(itens.length);
        String palavra = itens[index];//sorteada a palavra aleatoriamente
        StringBuilder word = new StringBuilder();//Stringbuilder pra conseguir modificar a string
        for (int i = 0; i < palavra.length(); i++) {
            word.append("_");
        }
        int erro = 0;
        boolean verificaVitoria = false;
        while(erro < 3 && verificaVitoria == false){
            System.out.println(word);
            System.out.print("Digite uma letra: ");
            Scanner read = new Scanner(System.in);
            char s = read.next().charAt(0);
            System.out.println();
            erro+= verificar(s, word, palavra);//unico método que achei de incrementar o erro
            verificaVitoria = check(palavra, word);
        }
        if(erro > 2){
            System.out.println("Voce perdeu :(");
            System.out.println("A palavra era: "+palavra);
        }
    }

    private static boolean check(String palavra, StringBuilder word) {
        int flag = 0;
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) == palavra.charAt(i)){
                flag++;
            }
        }
        if(flag == palavra.length()){
            System.out.println();
            System.out.println("VOCE VENCEU!!");
            System.out.println();
            return true;
        }
        else{
            return false;
        }
    }

    /*Aqui vou verificar se a palavra contem*/
    private static int verificar(char s, StringBuilder word, String palavra) {
        StringBuilder compare = new StringBuilder();
        for (int i = 0; i < palavra.length(); i++) {
            compare.append(palavra.charAt(i));
        }
        for(int i = 0; i<compare.length(); i++){
            String j = String.valueOf(s);
            if(palavra.contains(j)){
                if(compare.charAt(i) == s){
                    word.replace(i, i+1, j);
                }
            }
            else{
                return 1;
            }
        }
        return 0;
    }
}
