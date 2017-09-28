package domain;

import org.junit.Assert;
import org.junit.Test;

public class XspeedltParserTest {
    @Test
    public void should_return_empty_list_when_no_product() {
        final XspeedltParser xspeedltParser = new XspeedltParser ("");
        Assert.assertEquals ("", xspeedltParser.getProducts ( ));
    }

    @Test
    public void should_return_empty_list_when_one_product() {
        final XspeedltParser xspeedltParser = new XspeedltParser ("1");
        Assert.assertEquals ("1", xspeedltParser.getProducts ( ));
    }

    @Test
    public void should_return_empty_list_when_many_product() {
        final XspeedltParser xspeedltParser = new XspeedltParser ("12984");
        Assert.assertEquals ("1/2/9/8/4", xspeedltParser.getProducts ( ));
    }
}
