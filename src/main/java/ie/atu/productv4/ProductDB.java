package ie.atu.productv4;

import ie.atu.productv5.Description;

public class ProductDB {

    public static Description getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Description p = null;


        if (productCode.equalsIgnoreCase("java")
                || productCode.equalsIgnoreCase("jsp")
                || productCode.equalsIgnoreCase("mysql")) {
            Book b = new Book();
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
            p = (Description) b; // set Product object equal to the Book object
        } else if (productCode.equalsIgnoreCase("netbeans")) {
            Software s = new Software();
            s.setCode("netbeans");
            s.setDescription("NetBeans");
            s.setPrice(0.00);
            s.setVersion("8.2");
            p = (Description) s; // set Product object equal to the Software object
        }
        else if(productCode.equalsIgnoreCase("horse")){

        }
        else if(productCode.equalsIgnoreCase("dog")){

        }
        return p;
    }
}
