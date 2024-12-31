import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Double> conta = new ArrayList<>();
        int op = 1;
        System.out.println("Primeiramente, crie uma conta: ");
        criarConta(conta);
        mostarConta(conta);
        do {
            limpar();
            System.out.println("O que deseja fazer agora? ");
            System.out.println("1 - Adicionar valor na conta\n2 - remover valor da conta\n3 - Consultar contas\n4 - adicionar outra conta");
            Scanner read = new Scanner(System.in);
            op = read.nextInt();
            switch (op) {
                case 1:
                    limpar();
                    adicionar(conta, read);
                    break;
                case 2:
                    limpar();
                    remover(conta, read);
                    break;
                case 3:
                    limpar();
                    mostarConta(conta);
                    break;
                case 4:
                    limpar();
                    criarConta(conta);
                    break;
                default:
                    limpar();
                    System.out.println("Opção inválida");
            }
        } while (op != 0);

    }

    private static void limpar() {
        System.out.println("========================================================");
    }

    private static void adicionar(List<Double> conta, Scanner read) {
        System.out.println("Qual das suas contas deseja mexer? ");
        mostarConta(conta);
        int op = read.nextInt();
        if(verifica(conta, op)){
            System.out.println("Quanto deseja adicionar? ");
            double adicional = read.nextDouble();
            conta.set(op-1, conta.get(op-1) + adicional);
        }
        else{
            limpar();
            System.out.println("Conta inexistente");
            limpar();
        }
    }
    private static void remover(List<Double> conta, Scanner read) {
        System.out.println("Qual das suas contas deseja mexer? ");
        mostarConta(conta);
        int op = read.nextInt();
        if(verifica(conta, op)){
            System.out.println("Quanto deseja adicionar? ");
            double adicional = read.nextDouble();
            conta.set(op-1, conta.get(op-1) - adicional);
        }
        else{
            limpar();
            System.out.println("Conta inexistente");
            limpar();
        }

    }

    private static boolean verifica(List conta, int op) {
        if(conta.size() >= op){
            return true;
        }
        else{
            return false;
        }
    }

    private static void mostarConta(List<Double> conta) {
        System.out.println("Suas contas são: ");
        for (int i = 0; i < conta.size(); i++) {
            System.out.println(i + 1 + "--" + conta.get(i));
        }
    }

    private static void criarConta(List<Double> conta) {
        System.out.println("Crie a conta com seu primeiro valor: ");
        Scanner read = new Scanner(System.in);
        conta.add(read.nextDouble());
        System.out.println("Conta criada com sucesso!");
    }
}