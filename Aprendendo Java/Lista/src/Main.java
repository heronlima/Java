//Criando uma lista dinamica

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); //Leitura de dados
        ArrayList<String> pessoas = new ArrayList<String>(); //Array dinamico
        short op = 0;
        do{
            System.out.println("Entre com o nome do aluno: ");
            String write = read.nextLine(); //Leitura de String
            pessoas.add(write);
            System.out.println("Dados gravados!\n\n");
            System.out.println("Deseja entrar com mais valores? 1 - adicionar || 0 - parar.");
            op = read.nextShort();
            read.nextLine();
        }while(op != 0);
        for(String s : pessoas){
            System.out.println(s);
        }
    }
}