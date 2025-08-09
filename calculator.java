package calculator;
/*  
 * Author: Marcy Guthrie
 * Purpose: parse a string to complete a math operation within it
 * 
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener{

    // --- public variables ---
    JButton[] numButtons = new JButton[9]; 
    JButton[] funcButtons = new JButton[4];
    JButton[] zeButtons = new JButton[2];
    JTextField textField;
    JPanel numPanel, textPanel, funcPanel, zePanel;
    String txt = "waow";

    public Calculator(){

        // --- initializing frame --- 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Calculator");

        // --- numbers 1-9 panel ---
        numPanel = new JPanel(new GridLayout(3, 3));
        for(int ix = 0; ix < 9; ix++){
            numButtons[ix] = new JButton(Integer.toString(ix+1));
            numPanel.add(numButtons[ix]);
            numButtons[ix].addActionListener(this);
        }
        numPanel.setBounds(0,50, 150,150);

        // --- function panel ---
        funcPanel = new JPanel(new GridLayout(4,1));
        funcButtons[0] = new JButton("+");
        funcButtons[1] = new JButton("-");
        funcButtons[2] = new JButton("*");
        funcButtons[3] = new JButton("/");
        for(int ix = 0; ix < 4; ix++){
            funcPanel.add(funcButtons[ix]);
            funcButtons[ix].addActionListener(this);
        }
        funcPanel.setBounds(150,50,50,200);

        // --- zero/enter panel ---
        zePanel = new JPanel(new GridLayout(1,2));
        zeButtons[0] = new JButton("0");
        zeButtons[1] = new JButton("=");
        for(int ix = 0; ix < 2; ix++){
            zePanel.add(zeButtons[ix]);
            zeButtons[ix].addActionListener(this);
        }
        zePanel.setBounds(0,200,150,50);

        // --- text panel ---
        textPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        textField = new JTextField();
        textField.setFont(new Font(null,Font.PLAIN, 25));
        textField.setText(txt);
        textField.setEditable(false);
        textPanel.add(textField);
        textPanel.setBounds(0,0,200,50);

        // --- add components to frame ---
        this.add(numPanel);
        this.add(funcPanel);
        this.add(zePanel);
        this.add(textPanel);

        // --- launch frame ---
        this.setSize(220,300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == numButtons[0]){
            txt += "1";
            return;
        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
    /* 
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

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
    */