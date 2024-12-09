import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el radi del cilindre");
        int radi = scanner.nextInt();
        System.out.println("Introdueix l'alçada del cilindre");
        int alcada = scanner.nextInt();
        double area = calcularea(radi, alcada);
        double volum = calculvolum(radi, alcada);

        System.out.println("Àrea: " + area);
        System.out.println("Volum: " + volum);
    }

    public static double calcularea(int radi, int alcada){
        double areabase = 2 * 3.14 * radi * radi;
        double arealateral = 2 * 3.14 * radi * alcada;
        return areabase + arealateral;
    }
    public static double calculvolum(int radi, int alcada){
        return 3.14 * radi * radi * alcada;
    }
}
