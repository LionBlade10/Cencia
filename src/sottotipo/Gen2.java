package sottotipo;

/**
 * Created by Roxas on 11/04/2017.
 */

public class Gen2 <E> extends Gen1 <E> {

    public static void main(String[] args) {
        // test sottotipi generici

        Gen1<Object> x = new Gen1<Object>();
        x = new Gen2<Object>(); // Gen2<Object> e' sottotipo di Gen1<Object>
        x.stampa(8);
        x = new Gen1<>(); // Gen1<String> non e' sottotipo di Gen1<Object>

    }

}