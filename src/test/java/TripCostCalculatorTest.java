import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorTest {

    private TripCostCalculator tripCostCalculator;

    @BeforeEach
    void setUp() {
        tripCostCalculator = new TripCostCalculator();
    }

    @Test
    void main() {
        tripCostCalculator.main(new String[0]);
        // This method is void, so we can't test the return value
        // Instead, we can test that the method runs without throwing an exception
    }

    @Test
    void calculateTripCost() {
        tripCostCalculator.calculateTripCost(100, 1.5);
        assertEquals(7.5, tripCostCalculator.calculateTripCost(100, 1.5));
    }

    @Test
    void calculateFuelNeeded() {
        tripCostCalculator.calculateFuelNeeded(100);
        assertEquals(5, tripCostCalculator.calculateFuelNeeded(100));
    }
}