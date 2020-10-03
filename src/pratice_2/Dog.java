package pratice_2;

public class Dog {
    private String name;
    private int age;
    private double weight;
    private String breed;
    private boolean boosterShot;
    public Dog(){
        name = "No name yet.";
        age = 0;
        weight = 0;
        breed = "no breed yet.";
        this.boosterShot = false;
    }
    public Dog(String initialName, int initialAge, double initialWeight, String initialBreed, boolean boosterShot) {
        name = initialName;
        age = 0;
        weight = 0;
        breed = initialBreed;
        this.boosterShot = boosterShot;
    }
    public Dog(int initialAge) {
        name = "No name yet.";
        weight = 0;
        breed = "No breed yet.";
        boosterShot = false;
        if (initialAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        } else
            age = initialAge;
    }
    public Dog(double initialWeight) {
        name = "No name yet.";
        age = 0;
        breed = "No breed yet.";
        boosterShot = false;
        if (initialWeight < 0) {
            System.out.println("Error:Negative weight.");
            System.exit(0);
        } else
            weight = initialWeight;
    }
    public void setDog(String newName, int newAge, double newWeight, String newBreed, boolean boosterShot) {
        name = newName;
        if ((newAge < 0) || (newWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        } else {
            age = newAge;
            weight = newWeight;
            breed = newBreed;
            this.boosterShot = boosterShot;
        }
    }
    public boolean hadBoosterShot(){
        return this.boosterShot;
    }
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        } else
            age = newAge;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double newWeight) {
        if (newWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        } else
            weight = newWeight;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String newBreed) {
        breed = newBreed;
    }
    public boolean getBoosterShot() {
        return boosterShot;
    }
    public void setBoosterShot(boolean boosterShot) {
        this.boosterShot = boosterShot;
    }
    public void writeOutput(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + "years");
        System.out.println("Weight: " + weight + "pounds");
        System.out.println("Breed: " + breed);
        System.out.println("Booster shot status: " + boosterShot);
    }
}
}
