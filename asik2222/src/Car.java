import java.util.ArrayList;
import java.util.List;
class Car {
    private String brand;
    private String model;
    private double price;
    private String fuelType;

    public Car(String brand, String model, double price, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getFuelType() {
        return fuelType;
    }
}
