import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numero = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 6; i++) {
            numero = input(scanner);
        }
        int guanyador = numaleatori();
        if (numero == guanyador){
            System.out.println("GUANYADOR!!");
        }else {
            System.out.println("Mala sort!");
        }
    }
    public static int numaleatori(){
        Random random = new Random();
        return random.nextInt(49) + 1;
    }
    public static int input(Scanner scanner){
        for (int i = 0; i < 6; i++){
            System.out.println("Introdueix número entre 1 i 49");
        }
        return scanner.nextInt();
    }
}