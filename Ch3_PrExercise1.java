/*
Programmer: Anthony D'Ambrosio
Class     : CSM10J, Tues, 6:00-8:50
Date:     : 9/7/2015
Purpose   : File input, output.
*/

package ch3_prexercise1;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;

public class CH3_PrExercise1 
{
    public static void main(String[] args) throws FileNotFoundException
    {  
        Scanner console = new Scanner(System.in);
        
        double rectangleLength,
               rectangleWidth,
               rectangleArea,
               rectanglePerimeter;
                
        double circleRadius,
               circleArea,
               circleCircumference;
        
        String nameFirst,
               nameLast;
        
        int age;
        
        double startingBalance,
               endBalance,
               interestRate;
        
        char month,
             nextMonth;
        
        // a
        Scanner inFile;
        PrintWriter outFile;
        
        // b
        inFile = new Scanner(new FileReader("inFile.txt"));
        outFile = new PrintWriter("outData.dat");
       
        // I created a .dat file for each of the values listed in the project.
        // I'm importing them here.
        rectangleLength = inFile.nextDouble();
        rectangleWidth = inFile.nextDouble();
        circleRadius = inFile.nextDouble();
        nameFirst = inFile.next();
        nameLast = inFile.next();
        age = inFile.nextInt();
        startingBalance = inFile.nextDouble();
        interestRate = inFile.nextDouble();
        month = inFile.next().charAt(0);
       
        inFile.close();
        
        // d
        rectangleArea = (rectangleLength * rectangleWidth);
        rectanglePerimeter = ( ( ( rectangleLength * 2 ) + ( rectangleWidth * 2 ) ) );
       
        circleArea = (3.1416 * (circleRadius * circleRadius));
        circleCircumference = (2*(3.1416 * circleRadius));
        
        endBalance = ( startingBalance + ( ( startingBalance * ( interestRate / 100 ) ) / 12 ) );
        nextMonth = ((char)((int)(month) + 1));
        
        // e 
        outFile.printf("Rectangle:\nLength = %.2f, width = %.2f, area = %.2f, perimeter = %.2f\n\n",
                       rectangleLength, rectangleWidth, rectangleArea, rectanglePerimeter);
        
        outFile.printf("Circle:\nRadius = %.2f, area = %.2f, circumference = %.2f\n\n",
                       circleRadius, circleArea, circleCircumference);
        
        outFile.printf("Name: " + nameFirst + " " + nameLast + ", age: " + age + "\n");
        outFile.printf("Beginning balance = $%.2f, interest rate = %.2f\nBalance at the end of the month = $%.2f",
                       startingBalance, interestRate, endBalance);
        
        outFile.close();
     
        
    }
    
}
