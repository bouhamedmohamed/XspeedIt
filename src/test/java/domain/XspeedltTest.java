package domain;

import org.junit.Assert;
import org.junit.Test;

public class XspeedltTest {
    @Test

    public void should_return_8_packages() {
        XspeedltParser xspeedltParser = new XspeedltParser ("163841689525773");
        XspeedltCompute xspeedltCompute = new XspeedltCompute (xspeedltParser.getProducts ( ));
        xspeedltCompute.packageProducts ( );
        Assert.assertEquals (8, xspeedltCompute.getPackageProducts ( ).size ( ));

    }
}
