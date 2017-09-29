package domain;

import java.util.ArrayList;
import java.util.List;

public class XspeedltPackage {
    List products = new ArrayList ( );

    public List getProductsInside() {
        return products;
    }

    public void addProduct(int product) {
        products.add (product);
    }
}
