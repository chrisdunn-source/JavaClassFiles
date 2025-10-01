package Chaper18_Arrays.ForEach;

public class Store {
    public static void main(String[] args) {
        // Create an array of hats called hatArray
        Hat [] hatArray;

        // initialize the array to hold 3 hats
        hatArray = new Hat[3];

        //add 3 hats to our array ("Fedora", 6.99/ "Ballcap", 5.99 / "Beanie", 2.99)
        hatArray[0] = new Hat("Fedora", 6.99);
        hatArray[1] = new Hat("Ballcap", 5.99);
        hatArray[2] = new Hat("Beanie", 2.99);

        // create a  double variable to hold the sales number( call it totalSales)
        double totalSales = 0.0;

        // Use enhanced for loop to loop over hatArray
        for(Hat thisHat : hatArray )
        {
            // Print out name and cost
            System.out.println(thisHat.getName() + " costs $" + thisHat.getCost());

            //add the cost of the hat to totalSales
            totalSales += thisHat.getCost();
        }
        // Output the results
        System.out.println("Total hat sales: $" + totalSales);

    }
}
