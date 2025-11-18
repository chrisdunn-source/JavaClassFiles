package Unit3ClassNotes;

public class    CityAddress {
    private String zipCode;
    private String streetName;

    public CityAddress(String newZipCode, String newStreetName)
    {
        zipCode = newZipCode;
        streetName = newStreetName;
    }
    public String getZipCode()
    {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }


}
