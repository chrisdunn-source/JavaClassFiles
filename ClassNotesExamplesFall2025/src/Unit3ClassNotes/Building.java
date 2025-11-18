package Unit3ClassNotes;

public class Building {
    private String name;
    private CityAddress addr;

    public Building(String newName, CityAddress newAddress)
    {
        name = newName;
        addr = newAddress;
    }

    public CityAddress getAddr()
    {
        return addr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(CityAddress addr) {
        this.addr = addr;
    }
}
