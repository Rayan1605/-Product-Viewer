package ie.atu.productv5;

public class Animal implements Description {
    String breed;
    int age;
    String type;

    Animal(){

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "The age is " + getAge() + "\n while the breed is " + getBreed() + "\n and the type is" +
                " " + getType() + "\n";
    }
}
