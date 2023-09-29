
import java.util.Scanner;

public class LetterGrade {

    public static void main(String [] args){

         System.out.println(" \n Author: Prashanth Goud Janagama \n");

       
        char letterGrade;
        
        System.out.println(" Please enter your grade: ");

        Scanner scan =  new Scanner(System.in);

        int grade = scan.nextInt();

       

        // if grade >= 95, set the letterGrade to A+

        if (  grade >= 95 ){
            
            String Grade = "A+";

            System.out.println(" your test grade is:" +" " + Grade);
        } 

        // if grade >= 90, set the letterGrade to A

        else if(grade >= 90){
            letterGrade = 'A';

             System.out.println(" your test grade is:" +" " + letterGrade);
        }

        // if grade >= 85, set the letterGrade to B+

        else if(grade >= 85){
            String Grade = "B+";

             System.out.println(" your test grade is:" +" " + Grade);
        }

        // if grade >= 80, set the letterGrade to B

        else if(grade >= 80){
            letterGrade = 'B';

             System.out.println(" your test grade is:" +" " + letterGrade);
        }

        // if grade >= 75, set the letterGrade to C+

        else if(grade >= 75){
            String Grade = "C+";

             System.out.println(" your test grade is:" +" " + Grade);
        }
        // if grade >= 70, set the letterGrade to C

        else if(grade >= 70){
            letterGrade = 'C';

             System.out.println(" your test grade is:" +" " + letterGrade);
        }

        // if grade >= 65, set the letterGrade to D+

        else if(grade >= 65){
            String Grade = "D+";

             System.out.println(" your test grade is:" +" " + Grade);
        }
        // if grade >= 60, set the letterGrade to D

        else if(grade >= 60){
            letterGrade = 'D';

             System.out.println(" your test grade is:" +" " + letterGrade);
        }

        // if grade <= 60, set the letterGrade to F
       

         else{
              System.out.println(" Your test grade is: F");
        }
    }
}
