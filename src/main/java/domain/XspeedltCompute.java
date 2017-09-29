package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class XspeedltCompute {
    List<String> productsList = new ArrayList<> ( );

    public XspeedltCompute(List<String> productsListElement) {
        productsList = productsListElement;
        Collections.sort (productsList, Comparator.comparingInt (Integer::parseInt));
        Collections.sort (productsList, Collections.reverseOrder ( ));
    }

    public List sortedProducts() {
        return productsList;
    }

    public void visited(int position) {
        productsList.set (position, "-1");
    }
}
