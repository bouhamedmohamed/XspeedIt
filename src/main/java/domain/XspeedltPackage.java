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
        if ( hasEnoughCapacity (product) )
            products.add (product);
        else
            throw new IllegalArgumentException ( );
    }

    public boolean hasEnoughCapacity(int product) {
        final int currentWeight = products.stream ( ).mapToInt (i -> i).sum ( );
        return currentWeight + product <= MAX_WEIGHT;
    }

    public boolean isFull() {
        final int currentWeight = products.stream ( ).mapToInt (i -> i).sum ( );
        return currentWeight == MAX_WEIGHT;
    }


}
