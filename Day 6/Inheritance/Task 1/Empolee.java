public class Empolee {
    // irstName, lastName, CNIC, getFirstName, getLastName, getCNIC and a 
    // portion of method toString

    private String firstName;
    private String lastName;
    private String CNIC;

    public Empolee(String firstName, String lastName, String CNIC) {
        setFirstName(firstName);
        setLastName(lastName);
        setCNIC(CNIC);
    }
//Setter

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getCNIC() {
        return CNIC;
    } 

@Override
    public String toString() {
        return "Empolee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", CNIC='" + getCNIC() + '\'' +
                '}';
    }

}