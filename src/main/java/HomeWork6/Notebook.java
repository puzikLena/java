package HomeWork6;

public class Notebook {
    int id;
    String brand;
    String model;
    String colour;
    int ramMemory;
    int hddCapacity;

    public Notebook(int id, String brand, String model, String colour, int ramMemory, int hddCapacity) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.ramMemory = ramMemory;
        this.hddCapacity = hddCapacity;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", ramMemory=" + ramMemory +
                ", hddCapacity=" + hddCapacity +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public int getRamMemory() {
        return ramMemory;
    }
}
