package domain;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class XspeedltCompute {
    public List sortProducts(List<String> productsList) {
        Collections.sort (productsList, Comparator.comparingInt (Integer::parseInt));
        Collections.sort (productsList, Collections.reverseOrder ( ));
        return productsList;


    }
}
