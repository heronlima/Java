public class Main {
    public static void main(String[] args) {
        String teste = "O mundo é apenas uma ilusão!";
        String [] myArray = teste.split(" " );
        int x = myArray.length;
        System.out.println("A String: "+teste+"\nPossui: "+x+" Palavras!");
    }
}