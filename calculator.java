package calculator;
/*  
 * Author: Marcy Guthrie
 * Purpose: parse a string to complete a math operation within it
 * 
 */

public class Calculator {
    //No special set up
    public Calculator(){

    }

    public String calculate(String input){
        try{
            int op = getOperator(input);
            double result = 0;
            switch(op){
            case 0:
                result = add(input);
                break;
            case 1:
                result = sub(input);
                break;
            case 2:
                result = mult(input);
                break;
            case 3:
                result = div(input);
                break;
            
        }
        String res = Double.toString(result);
            return res;
        } catch (Exception e) {
            return e.toString();
        }
    }


    private double add(String input) {
        String[] inpArr;
        inpArr = input.split(" ");
        double val1 = Double.parseDouble(inpArr[0]);
        double val2 = Double.parseDouble(inpArr[2]);

        return val1 + val2;
    }

    private double sub(String input) {
        String[] inpArr;
        inpArr = input.split(" ");
        double val1 = Double.parseDouble(inpArr[0]);
        double val2 = Double.parseDouble(inpArr[2]);

        return val1 - val2;
    }

    private double mult(String input) {
        String[] inpArr;
        inpArr = input.split(" ");
        double val1 = Double.parseDouble(inpArr[0]);
        double val2 = Double.parseDouble(inpArr[2]);

        return val1 * val2;
    }

    private double div(String input) {
        String[] inpArr;
        inpArr = input.split(" ");
        double val1 = Double.parseDouble(inpArr[0]);
        double val2 = Double.parseDouble(inpArr[2]);

        return val1 / val2;
    }

    //searches for the operator and returns an int for which it is
    private int getOperator(String input) throws InvalidInputException {
        String[] inpArr;
        inpArr = input.split(" ");

        //inputs are in a specific format, this method would not work if format was broken
        if(inpArr[1].equals("+")){
            return 0;
        }
        else if(inpArr[1].equals("-")){
            return 1;
        }
        else if(inpArr[1].equals("*")){
            return 2;
        }
        else if(inpArr[1].equals("x")){
            return 2;
        }
        else if(inpArr[1].equals("/")){
            return 3;
        }
        throw new InvalidInputException("Not a valid input");
    }
    
}
