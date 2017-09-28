package domain;

public class XspeedltParser {
    public static final String SEPARATOR = "/";
    StringBuilder productsList = new StringBuilder ( );

    public XspeedltParser(String products) {
        if ( !products.isEmpty ( ) ) {
            final int length = products.length ( );
            for (int element = 0; element < length; element++) {
                productsList.append (createNewProduct (products, length, element));
            }
        }
    }

    private String createNewProduct(String products, int length, int element) {
        final String product = String.valueOf (products.charAt (element));
        final String separatorBetweenProducts = addSeparator (element, length);
        return product + separatorBetweenProducts;
    }

    private String addSeparator(int element, int length) {
        return element < length - 1 ? SEPARATOR : "";
    }

    public String getProducts() {
        return productsList.toString ( );
    }
}
