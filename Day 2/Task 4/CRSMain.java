import java.util.Scanner;

class CRS {
   String carName;
   String modelYear;
   int rentPerDay=100;
   int days;
   int isRented;
   int rentPaid;
   void deposit(int rent){
    if (rent == isRented){
        System.out.println("Book sussessfully");
    }
    else if (rent<= isRented){
       
        int Backrent = rent-isRented;
        System.out.println("Book Sussessfullu"+Backrent);

    }
    else 
    {
        System.out.println("Sorry Not Book");
    }
   }
void Book(int day)
{   this.days=day;
    isRented = day*rentPerDay;
    System.out.println("Your rent will be "+ isRented);
  
    
}}

public class CRSMain {

public static void main(String[] args) {
                CRS c = new CRS();
                c.Book(5);  
            Scanner input = new Scanner(System.in);
              System.out.println("Please Deposit the Payment");
    int rentPaid=input.nextInt();
    c.deposit(rentPaid);
}
}

