public class ComputerScience {
    public static void main(String[] args) {
        IBIO.output("Bond, James Bond");
        /*Actually it's Charles(Leroux), but the original James Bond movies starring Sean Connery are so good that I feel like I want 
        to be James Bond.*/
        int base = IBIO.inputInt("Input an integer for the base. It cannot be a 0."); //This is the base.
        int exponent = IBIO.inputInt("Input an integer for the exponent. Don't be a karen, don't input a negative exponent. If you do... the code will still work."); //This is the exponent.
        int baseToThePowerOfTheExponent = base; //This is to help raise the base to its power.
        if (base == 0) {
            IBIO.output("The base = 0. Nothing to do.");
            System.exit(0);
        } else if (exponent < 0) {
            IBIO.output("Exponent should be positive!");
            baseToThePowerOfTheExponent = 1;
            for(int i = exponent; i != 0; i++) {
			    baseToThePowerOfTheExponent *= base; 
            }
            IBIO.output(base + " to the power of " + exponent + " =");
            IBIO.output("");

            IBIO.output(" 1 ");
            IBIO.output("--- = "+1.0/baseToThePowerOfTheExponent);
            IBIO.output(base+"^"+exponent*-1);
            IBIO.output("");

            IBIO.output(" 1 ");
            IBIO.output("--- = "+1.0/baseToThePowerOfTheExponent);
            IBIO.output(baseToThePowerOfTheExponent);
            IBIO.output("");

            IBIO.output("1/" + baseToThePowerOfTheExponent);
            IBIO.output(1.0/baseToThePowerOfTheExponent);
        } else {
            for(int i = 1; i != exponent; i++) {
			    baseToThePowerOfTheExponent *= base; 
            }
            IBIO.output(baseToThePowerOfTheExponent);
        }	
    }
}
