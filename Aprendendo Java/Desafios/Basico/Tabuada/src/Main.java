import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entre com um valor: ");
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        for(int i = 0; i<11; i++){
            System.out.println(x+" x "+i+" = "+x*i);
        }
    }
}