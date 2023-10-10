import java.util.ArrayList;
import java.util.List;
class PriceRangeFilterDecorator implements CarFilter {
    private double minPrice;
    private double maxPrice;

    public PriceRangeFilterDecorator(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public List<Car> filter(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPrice() >= minPrice && car.getPrice() <= maxPrice) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}