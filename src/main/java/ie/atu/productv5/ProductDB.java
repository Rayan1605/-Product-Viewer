package ie.atu.productv5;

public class ProductDB {

    public static ie.atu.productv5.Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java")
                || productCode.equalsIgnoreCase("jsp")
                || productCode.equalsIgnoreCase("mysql")) {
            ie.atu.productv5.Book b = new Book();
            if (productCode.equalsIgnoreCase("java")) {
                b.setCode(productCode);
                b.setDescription("GMIT Java Programming");
                b.setPrice(57.50);
                b.setAuthor("Joe Brown");
            } else if (productCode.equalsIgnoreCase("jsp")) {
                b.setCode(productCode);
                b.setDescription("Java Servlets and JSP");
                b.setPrice(57.50);
                b.setAuthor("Mike Urban");
            } else if (productCode.equalsIgnoreCase("mysql")) {
                b.setCode(productCode);
                b.setDescription("Lennon's MySQL");
                b.setPrice(54.50);
                b.setAuthor("Joe Mura");
            }
            p = b; // set Product object equal to the Book object
        } else if (productCode.equalsIgnoreCase("netbeans")) {
            ie.atu.productv5.Software s = new Software();
            s.setCode("netbeans");
            s.setDescription("NetBeans");
            s.setPrice(0.00);
            s.setVersion("8.2");
            p = s; // set Product object equal to the Software object
        }
        else if (productCode.equalsIgnoreCase("PINK")){
        Music m = new Music();
        m.setCode(productCode);
        m.setDescription("Wish You were here by ");
        m.setPrice(8.00);
        m.setArtist("Pink Floyd");
        m.setLabel("Columbia group");
        p = m;
        } else if (productCode.equalsIgnoreCase("kdl43")) {
            Tv tv = new Tv();
            tv.setPrice(819);
            tv.setCode(productCode);
            tv.setManufacture("Sony");
            tv.setDescription("SONY BRAVIA SMART TV KDL43WF663 BY ");
            tv.setScreensize(55);
            p=tv;
        }
        return p;
    }
}