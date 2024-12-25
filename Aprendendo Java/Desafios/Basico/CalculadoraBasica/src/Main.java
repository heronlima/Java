import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Digite o primeiro valor: ");
        x = read.nextDouble();
        System.out.println("Digite o segundo valor: ");
        y = read.nextDouble();
        System.out.println("\n1-soma\n2-divisao\n3-subtração\n4-multiplicação\nQual operação? ");
        short op = read.nextShort();
        switch(op){
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x/y);
                break;
            case 3:
                System.out.println(x-y);
                break;
            case 4:
                System.out.println(x*y);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}