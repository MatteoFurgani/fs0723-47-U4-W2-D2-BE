package entities.es2;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        int n = 12;
        List<Integer> listaCasuale = Funzioni.CreareListaCasuale(n);
        System.out.println("Lista casuale ordinata: " + listaCasuale);

        List<Integer> listaInvertita = Funzioni.invertireLista( new ArrayList<>(listaCasuale));
        System.out.println("Lista invertita: " + listaInvertita);

        Funzioni.stampareLista(listaCasuale, true);

        Funzioni.stampareLista(listaCasuale, false);

    }
}
