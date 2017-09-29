package domain;

import org.junit.Assert;
import org.junit.Test;

public class XspeedltPackageTest {
    @Test
    public void should_add_two_products_below_10_weight() {
        final XspeedltPackage xspeedltPackage = new XspeedltPackage ( );
        xspeedltPackage.addProduct (2);
        xspeedltPackage.addProduct (8);
        Assert.assertEquals (2, xspeedltPackage.getProductsInside ( ).size ( ));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_add_three_products_but_just_below_10_weight() {
        final XspeedltPackage xspeedltPackage = new XspeedltPackage ( );
        xspeedltPackage.addProduct (2);
        xspeedltPackage.addProduct (6);
        xspeedltPackage.addProduct (6);
        Assert.assertEquals (2, xspeedltPackage.getProductsInside ( ).size ( ));
    }
}
