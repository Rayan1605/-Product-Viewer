package ie.atu.productv5;

public class Dog extends Animal {
    String vaccination;
    String shedding;
    String neutered;

    Dog(){
        super();
        vaccination = "";
        shedding = "";
        neutered = "";
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public String getShedding() {
        return shedding;
    }

    public void setShedding(String shedding) {
        this.shedding = shedding;
    }

    public String getNeutered() {
        return neutered;
    }

    public void setNeutered(String neutered) {
        this.neutered = neutered;
    }
    @Override
    public String toString(){
        return "This is a Horse " + super.toString() + " Vaccination: " + getVaccination() + "\n"
                +" \n And the shedding is "
                + getShedding() + " \n Neutered " + getNeutered();
    }
}
