package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class XspeedltParser {
    private final List<String> productsList = new ArrayList<> ( );

    public XspeedltParser(String products) {
        for (int element = 0; element < products.length ( ); element++) {
            this.productsList.add (String.valueOf (products.charAt (element)));
        }

    }

    public List<String> getProducts() {
        return Collections.unmodifiableList (productsList);
    }
}
