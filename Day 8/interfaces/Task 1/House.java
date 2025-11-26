public class House implements CarbonFootprint {
double squareFeet;
static final double CO2_PER_SQFT = 0.00002; // metric tons

House(double squareFeet){
    this.squareFeet = squareFeet;
}
public double getCarbonFootprint(){
    return squareFeet * CO2_PER_SQFT;
}
}

