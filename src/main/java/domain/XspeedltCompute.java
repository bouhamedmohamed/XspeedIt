package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class XspeedltCompute {
    private static final String VISITED = "-1";
    private final List<String> productsList = new ArrayList<> ( );
    private final List<XspeedltPackage> packageList = new ArrayList<> ( );

    public XspeedltCompute(List<String> productsListElement) {
        productsList.addAll (productsListElement);
        productsList.sort (Comparator.comparingInt (Integer::parseInt));
        productsList.sort (Collections.reverseOrder ( ));
    }

    public void packageProducts() {
        for (int productPosition = 0; productPosition < productsList.size ( ); productPosition++) {
            if ( isPackaged (productPosition) ) {
                XspeedltPackage xspeedltPackage = new XspeedltPackage ( );
                xspeedltPackage.addProduct (Integer.parseInt (productsList.get (productPosition)));
                packagingProduct (productPosition);
                packageList.add (createPackage (xspeedltPackage));
            }

        }

    }

    public List getProducts() {
        return productsList;
    }

    public void packagingProduct(int position) {
        productsList.set (position, VISITED);
    }

    private boolean isPackaged(int position) {
        return !productsList.get (position).equals (VISITED);
    }

    public List<XspeedltPackage> getPackageProducts() {
        return packageList;
    }

    private XspeedltPackage createPackage(XspeedltPackage xspeedltPackage) {

        for (int i =  0; i < productsList.size ( ); i++) {
            if ( xspeedltPackage.isFull ( ) )
                return xspeedltPackage;

            int productToAdd = Integer.parseInt (productsList.get (i));
            if ( xspeedltPackage.hasEnoughCapacity (productToAdd) && isPackaged (i) ) {
                xspeedltPackage.addProduct (Integer.parseInt (productsList.get (i)));
                packagingProduct (i);
            }
        }
        return xspeedltPackage;
    }


}
