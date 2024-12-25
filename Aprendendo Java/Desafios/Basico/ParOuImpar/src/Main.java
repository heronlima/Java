import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entre com um valor: ");
        Scanner read = new Scanner(System.in);
        double x = read.nextDouble();
        if(x%2==0){
            System.out.println("O numero é par");
        }
        else{
            System.out.println("O numero é impar!");
        }
    }
}