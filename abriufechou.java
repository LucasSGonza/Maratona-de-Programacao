
import java.util.ArrayList;
import java.util.Scanner;

public class abriufechou {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<String> lista = new ArrayList();

        if (t <= 500) {

            String simbolos[] = new String[t];

            for (int i = 0; i < t; i++) {
                simbolos[i] = scan.next();
                if (simbolos[i].length() <= 500) {
                    lista.add(simbolos[i]);
                }
            }

            for (int i = 0; i < t - 1; i++) {
                if (lista.get(i).startsWith("(")) {
                    if (lista.get(i).endsWith(")")) {
                        if (lista.get(i).contains("()")) {
                            System.out.println("OK");
                        } else {
                            System.out.print("NOK");
                        }
                    } else {
                        System.out.print("NOK");
                    }
                } else {
                    System.out.println("NOK");
                }
            }

            if (lista.get(t - 1).startsWith("(")) {
                if (lista.get(t - 1).endsWith(")")) {
                    if (lista.get(t - 1).contains("()")) {
                        System.out.print("OK");
                    } else {
                        System.out.print("NOK");
                    }
                } else {
                    System.out.print("NOK");
                }
            } else {
                System.out.print("NOK");
            }

        }
        scan.close();
    }
}
