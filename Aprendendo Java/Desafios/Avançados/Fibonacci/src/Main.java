import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sequencia de Fibonacci");
        System.out.println("Até qual posicao voce deseja ver em fibonacci? ");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println();
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        //unico metodo que achei, é ja startando os 2 primeiros valores de fibonacci
        fibonacci.add(1);
        fibonacci.add(1);
        //agora é fazer um for pegando e adicionado i e i-1 (igual a logica)
        for(int i=1;i<=n;i++){
            System.out.print(fibonacci.get(i-1)+"--");
            fibonacci.add(fibonacci.get(i)+fibonacci.get(i-1));
        }

    }
}