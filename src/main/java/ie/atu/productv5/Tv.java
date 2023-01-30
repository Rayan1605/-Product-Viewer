package ie.atu.productv5;

public class Tv extends Product{

   private int Screensize;
   private String Manufacture;

   public Tv(){
       super();
       Screensize = 0;
       Manufacture = "";
   }

    public int getScreensize() {
        return Screensize;
    }

    public void setScreensize(int screensize) {
        Screensize = screensize;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String manufacture) {
        Manufacture = manufacture;
    }
    @Override
    public String  toString(){
       return super.toString() + getManufacture() + "\n" + "Screen size is " + getScreensize();
    }
}
