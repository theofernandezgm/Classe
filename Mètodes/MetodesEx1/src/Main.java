import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = input(scanner);
        if (esparell(numero)){
            System.out.println("El número es parell");
        }else {
            System.out.println("El número és imparell");
        }
    }
    public int input(Scanner scanner){
        System.out.println("Introdueix un número");
        return scanner.nextInt();
    }
    public boolean esparell(int numero){
        return numero % 2 == 0;
    }
}
