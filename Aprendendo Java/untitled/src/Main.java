public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        int result = x*y;
        System.out.println("O valor é: "+result);
        if(result > 199){
            System.out.println("O valor total é maior ou igual a 200");
        }
        else{
            System.out.println("O valor total nem chega a 200");
        }

        String str[] = {"Diego", "Maria", "Fabio"};
        System.out.println(str.length);

    }
}