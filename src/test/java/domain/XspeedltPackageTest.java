package domain;

import org.junit.Assert;
import org.junit.Test;

public class XspeedltPackageTest {
    @Test

    public void should_add_one_products_below_10_weight() {
        final XspeedltPackage xspeedltPackage = new XspeedltPackage ( );
        xspeedltPackage.addProduct(2);
        xspeedltPackage.addProduct(6);
        Assert.assertEquals (2, xspeedltPackage.getProductsInside().size ());
    }
}
