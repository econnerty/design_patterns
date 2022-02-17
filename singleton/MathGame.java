package singleton;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Erik Connerty
 * Math Game singleton class
 */
public class MathGame {
    
    private static MathGame mathGame;
    private int score;
    private Random rand = new Random();
    private Scanner reader = new Scanner(System.in);
    private String[] operands = {"+","-","*","/"};

    /**
     * Private constructor to ensure singleton design pattern
     */
    private MathGame(){

    }

    /**
     * Return the only instance of mathgame
     * @return The MathGame
     */
    public static MathGame getInstance(){
        //Referenced from https://github.com/portiaportia/DesignPatterns/blob/master/src/csce247/singleton/ChocolateBoiler.java
        if (mathGame == null){
            System.out.println("Let's have fun with Math!");
            mathGame = new MathGame();
        }

        return mathGame;
        
    }

    /**
    * Runs the game and calls play recursively. Is recursion the best way to do this? Probably will cause issues if the game is played too many times.
    */
    public void play(){
        System.out.println("(P)lay or (Q)uit:");
        String input = reader.nextLine();
        if (input.equalsIgnoreCase("P")){
            if (playRound()){
                score++;
                System.out.println("You got it!");
            }
            play();
        }
        else if (input.equalsIgnoreCase("q")) {
            System.out.println("You won " + score + " games!\nGoodbye");
        }
        else {
            System.out.println("Sorry, you must enter p or q");
            play();
        }

    }

    public boolean playRound(){

        int firstNumber = rand.nextInt(100)+1;
        int secondNumber = rand.nextInt(100)+1;
        String operand = operands[rand.nextInt(operands.length)];
        String input;
        double answer;

        System.out.println("Round answer to 1 decimal place");
        
        System.out.print(firstNumber + " " + operand + " " + secondNumber + " = ");
        input = reader.nextLine();
        
        switch (operand){

            case "+":
                answer = Math.round((firstNumber + secondNumber)* 100.0)/ 100.0;
                break;
            case "-":
                answer = Math.round((firstNumber - secondNumber)* 100.0)/ 100.0;
                break;
            case "*":
                answer = Math.round((firstNumber * secondNumber)* 100.0)/ 100.0;
                break;
            case "/":
                DecimalFormat df = new DecimalFormat("0.0");
                answer = (Double.valueOf(firstNumber) / Double.valueOf(secondNumber));
                answer = Double.valueOf(df.format(answer));
                System.out.println(answer);
                break;
            default:
                System.out.println("Something went wrong");
                answer = 0.0;
                break;

        }

        //Need input validation before running this
        if (Double.parseDouble(input) == answer){
            return true;
        }
        else {
            System.out.println("The correct answer is: " + answer); 
            return false;
        }

        
        


    }

}
