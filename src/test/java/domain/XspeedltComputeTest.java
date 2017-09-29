package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class XspeedltComputeTest {

    private XspeedltCompute xspeedltCompute;


    @Test
    public void should_return_empty_list_when_empty_list() {
        xspeedltCompute = new XspeedltCompute (Collections.EMPTY_LIST);
        Assert.assertEquals (Collections.EMPTY_LIST, xspeedltCompute.sortedProducts ());
    }

    @Test
    public void should_return_same_list_when_one_element() {
        final List<String> oneProduct = Arrays.asList ("1");
        xspeedltCompute = new XspeedltCompute (oneProduct);
        Assert.assertEquals (oneProduct, xspeedltCompute.sortedProducts ());
    }

    @Test
    public void should_return_sorted_list_when_many_elements() {
        final List<String> oneProduct = Arrays.asList ("1", "3", "2", "4");
        xspeedltCompute = new XspeedltCompute (oneProduct);
        final List sortedProducts = xspeedltCompute.sortedProducts ();
        Assert.assertEquals ("4", sortedProducts.get (0));
        Assert.assertEquals ("3", sortedProducts.get (1));
        Assert.assertEquals ("2", sortedProducts.get (2));
        Assert.assertEquals ("1", sortedProducts.get (3));
    }

    @Test
    public void should_return_sorted_list_with_delete_one_element() {
        final List<String> oneProduct = Arrays.asList ("1", "3", "2", "4");
        xspeedltCompute = new XspeedltCompute (oneProduct);
        xspeedltCompute.packagingProduct (2);
        final List sortedProductsUpdated = xspeedltCompute.sortedProducts ();
        Assert.assertEquals ("4", sortedProductsUpdated.get (0));
        Assert.assertEquals ("3", sortedProductsUpdated.get (1));
        Assert.assertEquals ("-1", sortedProductsUpdated.get (2));
        Assert.assertEquals ("1", sortedProductsUpdated.get (3));
    }
    @Test
    public void should_return_package() {
        final List<String> oneProduct = Arrays.asList ("1", "3", "2", "4");
        xspeedltCompute = new XspeedltCompute (oneProduct);
         xspeedltCompute.packageProducts ();
        Assert.assertEquals (1, xspeedltCompute.getPackageProducts ().size ());
    }
}
