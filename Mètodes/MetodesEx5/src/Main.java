import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Si us plau escull si convertir a Celsius (1) o Farenheit(2)");
        int opcio = scanner.nextInt();
        if (opcio == 1){
            System.out.println("Introdueix la temperatura en farenheit");
            int fahrenheit = scanner.nextInt();
            double celsius = conversiocelsius(fahrenheit);
            System.out.println("La temp en celsius es de " + celsius);
        } else if (opcio == 2) {
            System.out.println("Introdueix la temperatura en celsius");
            int celsius = scanner.nextInt();
            double fahrenheit = conversiofarenheit(celsius);
            System.out.println("La temp en fahrenheit es de " +  fahrenheit);
        }
    }
    public static double conversiocelsius(int fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
    public static double conversiofarenheit(int celsius){
        return (9.0 / 5) * celsius + 32;
    }
}