public class Bill {// class
    private double costOfMeal;//instance variables
    private int totalCustomers;//instance variables

    public Bill(double totalBill, int numCustomers)//constructor
    {
        costOfMeal = totalBill;
        totalCustomers = numCustomers;
    }
    //Step One: Create the method signature
    public void addTip()
    {
        //Step Two: check is the totalCustomers is higher than 8
        if(totalCustomers >= 8)
        {
            //Step Three: if the number of customers is >= 8, add 25%
            // to the totalBill
            costOfMeal *=1.25;
        }
        else
        {
            //Step Four: else, add 20% to the totalBill
            costOfMeal *= 1.20;
        }


    }

    public static void main(String[] args) {
        /*
        Let’s write a method addTip() for the Bill class
        that adds 25% to the bill if the number of customers
         is higher than 8, and adds 20% to the bill if there
         are less than 8 customers. addTip() does not return
          any value.
         */
        Bill bill1 = new Bill(100.00,7);
        bill1.addTip();
        System.out.println(bill1.costOfMeal);

    }

}
