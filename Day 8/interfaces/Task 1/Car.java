public class Car implements CarbonFootprint {
    double milesDriven;
    double fuelEfficiency; // miles per gallon
    static final double CO2_PER_GALLON = .005; // metric tons of CO2 per gallon of gasoline
    Car (double milesDriven, double fuelEfficiency){
        this.milesDriven = milesDriven;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getCarbonFootprint(){
        double gallonsUsed = milesDriven / fuelEfficiency;
        return gallonsUsed * CO2_PER_GALLON;
    }






}
