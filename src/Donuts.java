public class Donuts {
    //"classes are blueprints for the things we want to make"
    //instance variable
    //todo: make these three comments into variables
    //frosting type
    public String frostingType;
    //is there a filling
    public boolean hasFilling;
    //number of donuts
    public int numberOfDonuts;

    public Donuts(int pnumberofdonuts) {
        frostingType = "Boston Creme";
        hasFilling = true;
        numberOfDonuts = pnumberofdonuts;
    }
    public void printinfo() {
            System.out.println("frosting type is" + frostingType);
        System.out.println("has filling" + hasFilling);
        System.out.println("the number of donuts is" + numberOfDonuts);

        }
        }
