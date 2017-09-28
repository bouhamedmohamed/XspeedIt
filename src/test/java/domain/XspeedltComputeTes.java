package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class XspeedltComputeTes {
    @Test

    public void should_return_empty_list_when_empty_list() {
        Assert.assertEquals (Collections.EMPTY_LIST,new XspeedltCompute().sortPorducts(Collections.EMPTY_LIST));
    }
}
