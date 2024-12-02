import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String paraula;
        char[]lletres;
        Scanner scanner = new Scanner(System.in);
        paraula = scanner.next();
        lletres = new char[paraula.length()];
        for (int i = 0; i < paraula.length(); i++){
            lletres[i] = paraula.charAt(i);
        }
        for (int i = i + 2; i < paraula.length(); i++){
            for (int j = i - 2; j--){

            }
        }
    }
}