import java.util.ArrayList;
import java.util.List;
public class CarSearchApp {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 25000.0, "Gasoline"));
        cars.add(new Car("Honda", "Civic", 22000.0, "Gasoline"));
        cars.add(new Car("Tesla", "Model 3", 45000.0, "Electric"));


        CarFilter brandFilter = new BrandFilterDecorator("Toyota");
        CarFilter priceFilter = new PriceRangeFilterDecorator(20000.0, 30000.0);

        List<Car> filteredCars = brandFilter.filter(cars);
        filteredCars = priceFilter.filter(filteredCars);

        for (Car car : filteredCars) {
            System.out.println("Brand: " + car.getBrand() + ", Model: " + car.getModel() + ", Price: " + car.getPrice());
        }
    }
}