package toStringMethod;

class Frog{
    private int iD;
    private String name;
    public Frog(int iD, String name){
        this.iD = iD;
        this.name = name;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(iD).append(": ").append(name);
        return sb.toString();
    }
}
public class App {
    public static void main(String[] args) {
        //Frog frog1 = new Frog();
    }
}
