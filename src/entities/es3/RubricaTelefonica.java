package entities.es3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {

    private Map<String, String> rubrica;

    public RubricaTelefonica() {
        rubrica = new HashMap<>();
    }

    public void inserisciContatto(String nome, String telefono){
        rubrica.put(nome, telefono);
    }

    public void cancellaCnontatto(String nome){
        rubrica.remove(nome);
    }

    public String ricercaTramiteTelefono(String telefono){
       for(Map.Entry<String, String> entry : rubrica.entrySet()){
           if(entry.getValue().equals(telefono)){
               return entry.getKey();
       }
       }
       return null;
    }

    public String ricercaTramiteNome(String nome){
        return rubrica.get(nome);
    }

    public void stampaRubrica(){
        System.out.println("Rubrica telefonica: ");
        for(Map.Entry<String, String> entry : rubrica.entrySet()){
            System.out.println("Nome: " + entry.getKey() + " Telefono: " + entry.getValue());
        }
    }


}
