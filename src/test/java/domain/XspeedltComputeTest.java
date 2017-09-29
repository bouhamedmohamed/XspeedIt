package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class XspeedltComputeTest {

    private XspeedltCompute xspeedltCompute;

    @Before
    public void setUp() throws Exception {
        xspeedltCompute = new XspeedltCompute ( );
    }

    @Test
    public void should_return_empty_list_when_empty_list() {
        Assert.assertEquals (Collections.EMPTY_LIST, xspeedltCompute.sortProducts (Collections.EMPTY_LIST));
    }

    @Test
    public void should_return_same_list_when_one_element() {
        final List<String> oneProduct = Arrays.asList ("1");
        Assert.assertEquals (oneProduct, xspeedltCompute.sortProducts (oneProduct));
    }

    @Test
    public void should_return_sorted_list_when_many_elements() {
        final List<String> oneProduct = Arrays.asList ("1", "3", "2", "4");
        final List sortedProducts = xspeedltCompute.sortProducts (oneProduct);
        Assert.assertEquals ("4", sortedProducts.get (0));
        Assert.assertEquals ("3", sortedProducts.get (1));
        Assert.assertEquals ("2", sortedProducts.get (2));
        Assert.assertEquals ("1", sortedProducts.get (3));
    }
}
