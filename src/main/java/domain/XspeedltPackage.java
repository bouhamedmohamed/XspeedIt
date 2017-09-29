package domain;

import java.util.ArrayList;
import java.util.List;

public class XspeedltPackage {
    public static final int MAX_WEIGHT = 10;
    List<Integer> products = new ArrayList ( );

    public List getProductsInside() {
        return products;
    }

    public void addProduct(int product) {
        if ( getPackageCapacity ( ) >= product )
            products.add (product);
        else
            throw new IllegalArgumentException ( );
    }

    private int getPackageCapacity() {
        return MAX_WEIGHT - products.stream ( ).mapToInt (i -> i).sum ( );
    }
}
