package ie.atu.productv5;

public class Horse extends Animal{
    int  height;
    String Dam;
    String Sire;
    Horse(){
        super();
      height = 0;
      Dam = "";
      Sire = "";
    }

    @Override
    public String toString() {
        return "Horse{" +
                "height=" + height +
                ", Dam='" + Dam + '\'' +
                ", Sire='" + Sire + '\'' +
                ' ' + super.toString();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDam() {
        return Dam;
    }

    public void setDam(String dam) {
        Dam = dam;
    }

    public String getSire() {
        return Sire;
    }

    public void setSire(String sire) {
        Sire = sire;
    }
}
