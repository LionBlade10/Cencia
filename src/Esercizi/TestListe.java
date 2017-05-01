package Esercizi;

import java.util.ArrayList;

/**
 * Created by Roxas on 06/03/2017.
 */
public class TestListe {
    static ArrayList test= new ArrayList();
    public static void main(String[] args) {
        // Gioca con le liste

        IntList l1 = new IntList(1, new IntList(9, new IntList(5,
                new IntList(3,null))));
       IntList l2 = new IntList(3, new IntList(7, null));
        l2.concat(l1); // concatena l2 con l1; ora l2 ha 5 elementi
        //l2.stampalista(4); // stampa i primo 4 elemento di l2
        //l2.stampalista(10); // stampa tutta l2 (dato che ha meno di elementi)
        l2.concat(l2); // concatena l2 con se stessa: si crea un loop!
       // l2.stampalista(56);// esegue 50 stampe degli elementi di
        //l2, percorrendola in cerchio
        l2.luppa();

        //for(int i=0; i<l2.stampa.size();i++){
           // System.out.println(l2.stampa.get(i));
        }
    }













