public class Address {
    private String city;
    private String country;

    private  Address(String city, String country) 
        {   setCity(city);
            setCountry(country);
        }
   //Setter 
    public void setCity(String city) {
         this.city = city;}
    public void setCountry(String country) {
         this.country = country;}
    //Getter
    public void getCity() {
        System.out.println("City: " + city);}
    public void getCountry() {
        System.out.println("Country: " + country);}

    public static Address createAddress(String city, String country) {
        return new Address(city, country);
    }
    @Override
    public String toString() {
        return city + ", " + country;
    }
}
