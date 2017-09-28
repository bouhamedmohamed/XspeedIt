package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class XspeedltParser {
    List productsList = new ArrayList ( );

    public XspeedltParser(String products) {
        if ( !products.isEmpty ( ) )
            productsList.add ("1");

    }

    public List getProducts() {
        return Collections.unmodifiableList (productsList);
    }
}
