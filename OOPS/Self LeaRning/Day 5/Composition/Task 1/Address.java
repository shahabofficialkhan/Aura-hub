public class Address {
    private String street;
    private String city;
    private String zipcode;
    private Phonenumber phonenumber;
    Address(String street, String city, String zipcode, Phonenumber phonenumber){
        setStreet(street);
        setCity(city);
        setZipcode(zipcode);
        setPhonenumber(phonenumber);
    }
    //Setter Method
    public void setStreet(String street){
        this.street = street;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;}
    public void setPhonenumber(Phonenumber phonenumber){
        this.phonenumber = phonenumber;
    }

    //Getter Method
    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String getZipcode(){
        return zipcode;
    }
    public String toString(){
        return "Full Address: " + street + " , " + city + ", " + zipcode + "\nPhone Number: " + phonenumber.toString();
    }


}
