package SuperHeroFiles;

public class SuperHero {
    private String name;
    private Power superPower;

    public SuperHero(String heroName, Power power)
    {
        name = heroName;
        superPower = new Power(power.getName(), power.getStrength());
        //Comment out:
        //superPower = power;
        //Assigning power to superPower make superPower an alias of power
        //The correct initialization is the commeted assignment below
        //Uncomment below, and comment out the superPower = power


    }
    public int getStrength()
    {
        return superPower.getStrength();
    }
    public void setStrength(int strength)
    {
        superPower.setStrength(strength);
    }
    public String toString()
    {
        return "SuperHero: " + name + ", Power: " + superPower.getName();
    }


}
