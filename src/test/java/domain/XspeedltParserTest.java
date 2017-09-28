package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class XspeedltParserTest {
    @Test
    public void should_return_empty_when_no_product() {
        final XspeedltParser xspeedltParser = new XspeedltParser ("");
        Assert.assertEquals (Collections.EMPTY_LIST, xspeedltParser.getProducts ( ));
    }

    @Test
    public void should_return_1_list_when_one_product() {
        final XspeedltParser xspeedltParser = new XspeedltParser ("1");
        Assert.assertEquals ("1", xspeedltParser.getProducts ( ).get (0));
    }

    @Test
    public void should_return_string_element_when_many_products() {
        final XspeedltParser xspeedltParser = new XspeedltParser ("12984");
        Assert.assertEquals ("1", xspeedltParser.getProducts ( ).get (0));
        Assert.assertEquals ("2", xspeedltParser.getProducts ( ).get (1));
        Assert.assertEquals ("9", xspeedltParser.getProducts ( ).get (2));
        Assert.assertEquals ("8", xspeedltParser.getProducts ( ).get (3));
        Assert.assertEquals ("4", xspeedltParser.getProducts ( ).get (4));
    }
}
