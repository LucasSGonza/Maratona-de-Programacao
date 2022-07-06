
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bemvindos {

    public static void main(String[] args) {
        ArrayList<String> ListaAlunos = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String n[] = new String[t];
        
        if (t >= 1 & t <= 100) {
            for (int i = 0; i < t; i++) {
                n[i] = scan.next();
                if (n.length <= 500) {
                    ListaAlunos.add(n[i]);
                }
            }
            Collections.sort(ListaAlunos);
            for (int i = 0; i < t - 1; i++) {
                System.out.println("Bem-vindo(a), " + ListaAlunos.get(i) + "!!!");        
            }
            System.out.print("Bem-vindo(a), " + ListaAlunos.get(t - 1) + "!!!");
        }
        scan.close();
    }
}
