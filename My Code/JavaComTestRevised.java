public class JavaComTestRevised {
    public static void main(String[] args) {
        
        IBIO.output("Charles Leroux");
      
        IBIO.output("");
        IBIO.output("=================================");

        int userInput = IBIO.inputInt("Input a number that is less than 10.");
        int userInput2 = userInput;
        int i = 0;
        String output = "hello";
                
        if (userInput > 0 || userInput < 10) {
           IBIO.output("Error 404... bye bye!");
            System.exit(0); 
            //Old code commented out
            for(i = 1; i < userInput; i++){
			output = i + "     " + i*i + "    " + userInput2;
            IBIO.output(output);
            userInput2 *= userInput;
            }
            IBIO.output(userInput + "     " + userInput*userInput + "    " + userInput2);
        } else {
            IBIO.output("Error, try again.");
            userInput = IBIO.inputInt("Input a number that is less than 10.");
        }

    }
}
