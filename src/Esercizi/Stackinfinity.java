package Esercizi;

import java.util.Scanner;

/**
 * Created by Roxas on 28/02/2017.
 */
public class Stackinfinity {


    public static void main(String[] arg){

     stack();

    }



    public static void stack(){
        Scanner input = new Scanner(System.in);
        ArrayStack S = new ArrayStack();

        int lunghezza;
        S = new ArrayStack(1);
        lunghezza=S.lunghezza();
       while(true) {

           int numero;
               System.out.println("Inserisci un numero da inserire nello stack:\n\n");
               numero = input.nextInt();
               S.push(numero);
           ArrayStack S1 = new ArrayStack();
           S=S.copy(lunghezza, S);
           S1=S.copy(lunghezza, S);
           lunghezza=lunghezza+1;


           System.out.println("La lunghezza dello stack è:   "+lunghezza);

          for(int i=0; i<S1.lunghezza();i++){
              System.out.println(S1.pop());

      }






       }
    }


    public static void prova(){

        ArrayStack S = new ArrayStack();
        S= new ArrayStack(1);
        S.push(5);
        S.push(8);
        for(int i=0;i<S.lunghezza(); i++) {
            System.out.println(S.popcontrario());
        }
        // System.out.println(S.pop())
    }
}
