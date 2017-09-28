package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class XspeedltParser {
    public static final String SEPARATOR = "/";
    List<String> productsList = new ArrayList<> ( );

    public XspeedltParser(String products) {
        if ( !products.isEmpty ( ) ) {
            final int length = products.length ( );
            for (int element = 0; element < length; element++) {
                this.productsList.add (String.valueOf (products.charAt (element)));
            }
        }
    }

    public List<String> getProducts() {
        return Collections.unmodifiableList (productsList);
    }
}
