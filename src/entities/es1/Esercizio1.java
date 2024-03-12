package entities.es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di elementi: ");
        int N = Integer.parseInt(scanner.nextLine());

        Set<String> parole = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.println("Inserisci le parole: ");
        for (int i = 0; i < N; i++) {
            String parola = scanner.nextLine();
            if (!parole.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Le parole duplicate sono: ");
        for ( String parola : paroleDuplicate) {
            System.out.println(parola);
        }

        System.out.println("Numero di parole distinte: " + parole.size());

        System.out.println("Elenco di parole distinte: ");
        for ( String parola : parole) {
            System.out.println(parola);
        }


        scanner.close();
    }
}
