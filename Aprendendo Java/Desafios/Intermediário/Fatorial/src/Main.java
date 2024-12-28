import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Entre com um valor inteiro: ");
        int x = read.nextInt();
        int fatorial = 1;
        for(int i = 1;i<=x; i++){
            fatorial*=i;
        }
        System.out.println(fatorial);
    }
}