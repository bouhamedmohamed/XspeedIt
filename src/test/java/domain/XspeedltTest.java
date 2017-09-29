package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class XspeedltTest {
    @Test
    public void should_return_8_packages() {
        XspeedltParser xspeedltParser = new XspeedltParser ("163841689525773");
        XspeedltCompute xspeedltCompute = new XspeedltCompute (xspeedltParser.getProducts ( ));
        xspeedltCompute.packageProducts ( );
        final List<XspeedltPackage> packageProducts = xspeedltCompute.getPackageProducts ( );
        Assert.assertEquals (8, packageProducts.size ( ));
        printPackage (packageProducts);
    }

    private void printPackage(List<XspeedltPackage> packageProducts) {
        for (XspeedltPackage packageProduct : packageProducts) {
            final List<Integer> productsInside = packageProduct.getProductsInside ( );
            System.out.println ("this Package contains "+productsInside.size () + " product(s)" );

            for (Integer product : productsInside) {
                System.out.println (product);
            }
            System.out.println ("*********************" );

        }
        System.out.println ("********* total package count ("+packageProducts.size ()+")************" );
    }

}
