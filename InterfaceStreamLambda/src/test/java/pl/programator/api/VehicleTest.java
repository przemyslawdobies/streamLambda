package pl.programator.api;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    //TODO napisac test
    void shouldReturnCarsOnly_when_FILTER_CARS_precicate_used() {
        //TODO 1 tworzymy liste vehicli - 3 samoch, 7 innych
        List <Vehicle> listToBeFiltered = Arrays.asList(
                new Car(),
                new Car(),
                new Car(),
                new Boat(),
                new Boat(),
                new Boat(),
                new Boat(),
                new Plane(),
                new Plane(),
                new Plane()
        );
        //TODO 2 filtrujemy samochody używając metody statycznej interfejsu

        // użycie predefiniowanego predykatu
        //List<Vehicle> filterList = Vehicle.filteredList(listToBeFiltered, Vehicle.FILTER_CARS);

        //podanie predykatu w filtrze
        List<Vehicle> filterList = Vehicle.filteredList(listToBeFiltered, v -> v instanceof Car);

        /*List<Vehicle> filterList = Vehicle.filteredList(listToBeFiltered, new Predicate<Vehicle>() {
            @Override
            public boolean test(Vehicle vehicle) {
                return vehicle instanceof Car;
            }
        });
        */
        //inny przykład filtrowania i połączenia warunków
        //List<Vehicle> filterList = Vehicle.filteredList(listToBeFiltered, Vehicle.FILTER_BOATS.or(Vehicle.FILTER_PLANES))

        //TODO 3 sprawdzamy czy właściwa ilość elemenntów
        assertEquals(3, filterList.size());

    }
}