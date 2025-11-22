class AutomaticCar {
    private String model ;
    private int year ;
    private double speed = 0 ;
    private int gear;


    AutomaticCar(String model , int year ){
        setmodel_Year(model,year);
    }

    void setmodel_Year (String model , int year)
    {
        this.year= year;
        this.model=model;
    }
    void setgear (double Speed)
    {   if (speed ==0 ){
        this.gear = 0;
    } else
         if (speed  > 0 & speed <= 100 )
            {
            this.gear= 1;
        }else 
            if(speed  > 100 & speed <=200)
                {
                    this.gear= 2;
        } 
        else 
            if(speed  > 200 &  speed <=300)
                {
                    this.gear= 3;
        } else 
        if(speed  > 300 &  speed <=400)
                {
                    this.gear= 4;
        }  
         else 
        if(speed  > 400 &  speed <=500)
                {
                    this.gear= 5;
        } 
         
        else {
            this.gear=3;
        } 
    }

int getgear(){
    return gear;
}

void  updatespeed (double newspeed ){
    
    if (newspeed == speed){
        return;
    }
   else if (newspeed < speed){
       this.speed = newspeed;
       setgear(newspeed);
    }
  else if (newspeed > speed){
       this.speed = newspeed;
       setgear(newspeed);
    }


}

}

