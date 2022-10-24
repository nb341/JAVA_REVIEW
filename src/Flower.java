public class Flower {
    private int numPetals;
    private String name;
    private float price;

    Flower(String n, int np, float p){
        numPetals = np;
        name = n;
        price =p;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumPetals(int numPetals) {
        this.numPetals = numPetals;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public int getNumPetals() {
        return numPetals;
    }

    public String getName() {
        return name;
    }
}
