package wildcard;

/**
 * Created by Roxas on 11/04/2017.
 */
public class Gen <E> {

    public void stampaGnat () {
        System.out.println("gnat");
    }

    public void stampa (E s) {
        System.out.println(s);
    }

}

    BinTree appoggio = left;
left = right;
        right = appoggio;

        if( left != null)
        left.flip();
        if( right != null)
        right.flip();