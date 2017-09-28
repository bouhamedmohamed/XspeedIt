package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class XspeedltParserTest {
    @Test

    public void should_return_empty_list_when_no_product() {
        final XspeedltParser xspeedltParser = new XspeedltParser ( );
        Assert.assertEquals (Collections.EMPTY_LIST, xspeedltParser.getProducts());
    }
}
