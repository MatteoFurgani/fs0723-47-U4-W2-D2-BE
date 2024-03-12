package entities.es3;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        rubrica.inserisciContatto("Matteo", "33344556674");
        rubrica.inserisciContatto("Claudia", "33344557774");
        rubrica.inserisciContatto("Annalisa", "33344550244");
        rubrica.inserisciContatto("Fabio", "33845546674");

        rubrica.stampaRubrica();

        System.out.println("Ricerca telefono di Matteo: " + rubrica.ricercaTramiteNome("Matteo"));
        System.out.println("Ricerca nome del numero 33344557774: " + rubrica.ricercaTramiteTelefono("33344557774"));

        rubrica.cancellaCnontatto("Annalisa");
        rubrica.stampaRubrica();

    }
}
