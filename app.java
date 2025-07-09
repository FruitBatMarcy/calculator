package calculator;
import java.util.Scanner;
/*
 * Author: Marcy Guthrie
 * Purpose: Run a basic calculator that can parse string inputs into results
 * Date: 7/9/2025
 */

public class app{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input;
        String result;
        
        
        Calculator calc = new Calculator();

        System.out.println("input: 'number 1' 'opperator' 'number 2'");
        input = scan.nextLine();

        result = calc.calculate(input);

        System.out.println(result);


        scan.close();
    }
}