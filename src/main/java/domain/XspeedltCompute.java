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
            if ( isProductWasPackaged (productPosition) ) {
                XspeedltPackage xspeedltPackage = new XspeedltPackage ( );
                final int productToAdd = Integer.parseInt (productsList.get (productPosition));
                addProductToPackage (productPosition, xspeedltPackage, productToAdd);
                packageList.add (createPackage (xspeedltPackage));
            }

        }

    }

    private void addProductToPackage(int productPosition, XspeedltPackage xspeedltPackage, int product) {
        xspeedltPackage.addProduct (product);
        packagingProduct (productPosition);
    }

    public List getProducts() {
        return productsList;
    }

    public void packagingProduct(int position) {
        productsList.set (position, VISITED);
    }

    private boolean isProductWasPackaged(int position) {
        return !productsList.get (position).equals (VISITED);
    }

    public List<XspeedltPackage> getPackageProducts() {
        return packageList;
    }

    private XspeedltPackage createPackage(XspeedltPackage xspeedltPackage) {

        for (int productPositionInList =  0; productPositionInList < productsList.size ( ); productPositionInList++) {
            if ( xspeedltPackage.isFull ( ) )
                return xspeedltPackage;

            int productToAdd = Integer.parseInt (productsList.get (productPositionInList));
            if ( xspeedltPackage.hasEnoughCapacityFor (productToAdd) && isProductWasPackaged (productPositionInList) ) {
                addProductToPackage (productPositionInList, xspeedltPackage, productToAdd);
            }
        }
        return xspeedltPackage;
    }


}
