import java.util.ArrayList;
import java.util.List;
class BrandFilterDecorator implements CarFilter {
    private String brandToFilter;

    public BrandFilterDecorator(String brand) {
        this.brandToFilter = brand;
    }

    @Override
    public List<Car> filter(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brandToFilter)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}