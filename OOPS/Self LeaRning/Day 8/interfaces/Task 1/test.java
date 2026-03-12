import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
       ArrayList<CarbonFootprint> items = new  ArrayList<>();
        items.add(new Car(100 ,25));

        items.add(new House(2000));
        items.add(new Car(100, 40));
        items.add(new House(1500));
        TotalCarbonFootprint(items);


    }


    public static void TotalCarbonFootprint(ArrayList<CarbonFootprint> items){
        double total =0;
       for (CarbonFootprint item :items){
        total +=item.getCarbonFootprint();
       }
         System.out.println("Total Carbon Footprint: " + total + " metric tons");
    }
}
