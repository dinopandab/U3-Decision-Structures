import javax.swing.*;

public class ShippingCosts {

    /*
    A Shipping Company charges the following rates
    for each 100 miles shipped:

    2 lbs or less ..................... $1.10
    over 2 lbs but less than 6 lbs ..... $2.20
    over 6 lbs but less than 10 lbs .... $3.70
    over 10 lbs ....................... $4.80

    Write a program to calculate the shipping price. The
    distance is not prorated, in other words, the price doesn't
    increase until the next 100 miles, i.e. 150 miles for a 3lbs
    package is still just $2.20.

    Example Run:
    Weight: 5.6lbs
    Distance: 345 miles
    Price: $6.60

    As always, your program should include a method.
     */


    public static void main(String[] args) {

        double itemWeight = Double.parseDouble(JOptionPane.showInputDialog("How much is the weight? "));
        int milesShipped = Integer.parseInt(JOptionPane.showInputDialog("how many miles will it ship? "));
        double shippingRate;
        double cost;

        if(itemWeight >= 10){
            shippingRate = 4.80;
        }else{
            if (itemWeight >= 6){
                shippingRate = 3.70;
            }else{
                if (itemWeight >= 2){
                    shippingRate = 2.20;
                }else{
                    shippingRate = 1.10;
                }
            }
        }
    }


    }

    public static double cost(double rate, int miles) {

        int costMultiplier = miles/100;

        if(costMultiplier == 0){
            costMultiplier = 1;
        }

        return rate*costMultiplier;

    }

}
