package Esercizi;

import java.util.ArrayList;

/**
 * Created by Roxas on 06/03/2017.
 */
public class IntList {
    // liste di interi; GREZZO!!
    int i=0;

        public int head;
     public IntList tail;

             IntList(int h, IntList t) {

         this.head = h;
         tail = t;
         }

            public void stampalista (int n) {
         //stampa la lista, ma non oltre l'n-esimo elemento

         if (n <= 0) {
             System.out.println();
             return;
          }
         System.out.print(head + " ");
        if (tail == null)
         System.out.println();
         else
         tail.stampalista(n-1);
        }

       public void concat (IntList l) {
       // concatena this con l
       if (tail == null) {
           System.out.println("Aggiungo un elemento :\n\n");

           tail = l;
       }
       else tail.concat(l);


         //  System.out.println("Ho terminato alla ricorsione numero: "+i);
      }

       public void luppa () {
       // concatena this a se stesso. Si crea un loop!

       concat(this);
       }
    }