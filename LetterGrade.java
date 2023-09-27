
import java.util.Scanner;

public class LetterGrade {

    public static void main(String [] args){

         System.out.println(" \n Author: Prashanth Goud Janagama \n");

       
        char letterGrade;
        
        System.out.println(" Please enter your grade: ");

        Scanner scan =  new Scanner(System.in);

        int grade = scan.nextInt();

       

        // if grade >= 90, set the letterGrade to A

        if (  grade >= 90 ){
            letterGrade = 'A';

            System.out.println(" your test grade is:" + letterGrade);
        } 

        // if grade >= 80, set the letterGrade to B

        else if(grade >= 80){
            letterGrade = 'B';

             System.out.println(" your test grade is:" + letterGrade);
        }
        // if grade >= 70, set the letterGrade to C

        else if(grade >= 70){
            letterGrade = 'C';

             System.out.println(" your test grade is:" + letterGrade);
        }
        // if grade >= 60, set the letterGrade to D

        else if(grade >= 60){
            letterGrade = 'D';

             System.out.println(" your test grade is:" + letterGrade);
        }
        // else set the letterGrade to F

        else{
              System.out.println(" Set the letterGrade to F");
        }
    }
}
