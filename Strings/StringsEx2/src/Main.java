import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String paraula;
        char[]lletres;
        int[]comptador;
        Scanner scanner = new Scanner(System.in);
        paraula = scanner.next();
        lletres = new char[paraula.length()];
        comptador = new int[paraula.length()];
        for (int i = 0; i < paraula.length(); i++){
            lletres[i] = paraula.charAt(i);
        }
        for (int i = 0; i < paraula.length(); i++){
            for (int j = i + 1; j < paraula.length(); j++){
                if (lletres[i] == lletres[j]){
                    comptador[i]++;
                    lletres[j]=' ';
                }
            }
        }
        for (int i = 0; i < paraula.length(); i++){
            if (lletres[i] != ' '){
                System.out.println("'" + lletres[i] + "':" + (comptador[i] + 1));
            }
        }
    }
}