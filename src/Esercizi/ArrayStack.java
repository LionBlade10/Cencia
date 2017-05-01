package Esercizi;

/**
 * Created by Roxas on 28/02/2017.
 */
public class ArrayStack {

    private final static int SIZE = 10;
    private int[] stk;
    private int top = -1;
    int lunghezza = -1;

   ArrayStack() {
        stk = new int[SIZE];
         }
    ArrayStack(int l) {
       stk = new int[l];
         }
    public int lunghezza () {
        return stk.length;
        }


    public void push (int v) { //inserisce un intero in cima alla pila
        top = top + 1;
        stk[top] = v;
         }

    public int pop () { //estrae l'elemento in cima alla pila (e lo restituisce)
        top = top - 1;
        return stk[top + 1];
    }
    public int popcontrario () { //estrae l'elemento in cima alla pila (e lo restituisce)
        lunghezza=lunghezza+1;
        return stk[lunghezza];
    }


    public ArrayStack copy(int n, ArrayStack e){
         lunghezza = -1;
        int poppato;
        ArrayStack copia = new ArrayStack();
        copia = new ArrayStack(n+1);

        for(int i=0;i<e.lunghezza(); i++){
          poppato= e.popcontrario();
           // System.out.println(poppato+"ciao");
            copia.push(poppato);

        }

        return copia;


    }



}

