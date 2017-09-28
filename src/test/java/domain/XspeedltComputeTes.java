package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class XspeedltComputeTes {

    private XspeedltCompute xspeedltCompute;

    @Before
    public void setUp() throws Exception {
        xspeedltCompute = new XspeedltCompute ( );
    }

    @Test
    public void should_return_empty_list_when_empty_list() {
        Assert.assertEquals (Collections.EMPTY_LIST, xspeedltCompute.sortPorducts (Collections.EMPTY_LIST));
    }

    @Test

    public void should_return_same_list_when_one_element() {
        final List<String> oneProduct = Arrays.asList ("1");
        Assert.assertEquals (oneProduct , xspeedltCompute.sortPorducts (oneProduct));
    }
}
