import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        Scanner x = new Scanner(System.in);
        int op = 99;
        while(op!=0){
            System.out.print("Digite:\n1-Adicionar\n2-Listar\n3-Remover\n0-Parar\n");
            op = x.nextInt();
            switch(op){
                case 1:
                    System.out.print("Adicione um item a lista: ");
                    String pessoa = x.next();
                    System.out.println();
                    adicionar(pessoa, lista);
                    break;

                case 2:
                    mostrar(lista);
                    break;

                case 3:
                    remover(lista);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void adicionar(String pessoa, List lista){
        lista.add(pessoa);
    }

    private static void mostrar(List lista) {
        int tamanho = lista.size();
        System.out.println();
        for(int i=0;i<tamanho;i++){
            System.out.println(lista.get(i));
        }
        System.out.println();
    }
    private static void remover(List lista){
        System.out.println("Digite o nome de quem quer remover: ");
        Scanner read = new Scanner(System.in);
        String resposta = read.next();
        int tamanho = lista.size();
        boolean removed = false;
        for(int i=0;i<tamanho;i++){
            if(resposta.equals(lista.get(i))){
                removed = true;
                System.out.println("Removido!");
            }
        }
        if(removed){
            lista.remove(resposta);
        }
        else{
            System.out.println("Nome "+ resposta +" nao foi achado na lista!");
        }
    }
}