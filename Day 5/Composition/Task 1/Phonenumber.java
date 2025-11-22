public class Phonenumber{
    private String countrycode;
    private String phonenumber;
    Phonenumber(String countrycode, String phonenumber){
        setCountrycode(countrycode);
        setPhonenumber(phonenumber);
    }
    //Setter Method 
    public void setCountrycode(String countrycode){
        this.countrycode = countrycode;
    }
    public void setPhonenumber(String phonenumber){
        this.phonenumber = phonenumber;
    }

    //Getter Method 
    public String getCountrycode(){
        return countrycode;
    }
    public String getPhonenumber(){
        return phonenumber;
    }
    public String toString(){
        return countrycode + " " + phonenumber;
    }

}