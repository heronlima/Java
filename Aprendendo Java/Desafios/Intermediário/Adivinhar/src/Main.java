public class Main {
    public static void main(String[] args) {
        int random = (int)(Math.random()*100);
        int n = 50;
        if(n == random){
            System.out.println("VOCE GANHOU!");
        } else if (n < random && n+10 > random) {
            System.out.println("está bem proximo, aumente um pouco!");
        } else if (n > random && n-10 < random) {
            System.out.println("está bem proximo, diminua um pouco!");
        } else if (n-10 < random) {
            System.out.println("Aumente!");
        }
        else{
            System.out.println("Diminua!");
        }

        System.out.println(random);
    }
}