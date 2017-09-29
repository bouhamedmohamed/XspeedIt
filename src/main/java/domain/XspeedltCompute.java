package domain;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class XspeedltCompute {
    public List sortPorducts(List<String> productsList) {
        if ( productsList.isEmpty ( ) )
            return Collections.EMPTY_LIST;
        if ( productsList.size ( ) == 1 )
            return productsList;
        else {
            Collections.sort (productsList, Comparator.comparingInt (Integer::parseInt));
            Collections.sort (productsList, Collections.reverseOrder ( ));
            return productsList;
        }

    }
}
