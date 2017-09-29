package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class XspeedltCompute {
    public static final String VISITED = "-1";
    List<String> productsList = new ArrayList<> ( );
    List<XspeedltPackage> packageList = new ArrayList<> ( );

    public XspeedltCompute(List<String> productsListElement) {
        productsList = productsListElement;
        Collections.sort (productsList, Comparator.comparingInt (Integer::parseInt));
        Collections.sort (productsList, Collections.reverseOrder ( ));
    }

    public List sortedProducts() {
        return productsList;
    }

    public void packagingProduct(int position) {
        productsList.set (position, VISITED);
    }

    public boolean isPackaged(int position) {
        return productsList.get (position).equals (VISITED);
    }

    public List<XspeedltPackage> getPackageProducts() {
        return packageList;
    }

    public void packageProducts() {
        for (int productPosition = 0; productPosition < productsList.size ( ); productPosition++) {
            if ( !isPackaged (productPosition) ) {
                XspeedltPackage xspeedltPackage = new XspeedltPackage ( );
                packagingProduct (productPosition);
                xspeedltPackage.addProduct (Integer.parseInt (productsList.get (productPosition)));
                packageList.add (createPackage (xspeedltPackage));
            }

        }

    }

    private XspeedltPackage createPackage(XspeedltPackage xspeedltPackage) {

        for (int i = productsList.size ( ) - 1; i >= 0; i--) {
            if ( xspeedltPackage.isFull ( ) )
                return xspeedltPackage;

            int productToAdd = Integer.parseInt (productsList.get (i));
            if ( xspeedltPackage.hasEnoughCapacity (productToAdd) && !isPackaged (i) ) {
                packagingProduct (i);
                xspeedltPackage.addProduct (Integer.parseInt (productsList.get (i)));
            }
        }
        return xspeedltPackage;
    }


}
