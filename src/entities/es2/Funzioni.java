package entities.es2;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Funzioni {
    public static List<Integer> CreareListaCasuale(int n) {

        Random rndm = new Random();
        List<Integer> listaCasuale = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            listaCasuale.add(rndm.nextInt(101));
        }

        Collections.sort(listaCasuale);
        return listaCasuale;
    };

    public static List<Integer> invertireLista(List<Integer> lista) {

        List<Integer> invertiLista = new ArrayList<>();

        for ( int i = lista.size() - 1; i >= 0; i--) {
            invertiLista.add(lista.get(i));
        }

        Collections.reverse(lista);
        return invertiLista;
    }

    public static void stampareLista( List<Integer> lista, boolean pari){

        System.out.println(pari ? "Lista Dispari: " : "\nLista Pari: ");
        for ( int i = pari ? 0 : 1; i < lista.size(); i += 2) {
            System.out.print(lista.get(i) + " ");
        }


    }


}
