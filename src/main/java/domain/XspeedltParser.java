package domain;

public class XspeedltParser {
    public static final String SEPARATOR = "/";
    StringBuilder productsList = new StringBuilder ( );

    public XspeedltParser(String products) {
        if ( !products.isEmpty ( ) ) {
            for (int i = 0; i < products.length ( ); i++) {
                productsList.append (String.valueOf (products.charAt (i)) + SEPARATOR);
            }
            deleteLastSeparator ( );
        }
    }

    private void deleteLastSeparator() {
        productsList.deleteCharAt (productsList.length ( ) - 1);
    }

    public String getProducts() {
        return productsList.toString ( );
    }
}
