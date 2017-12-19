package student.s_grade_steven.jin;

import java.util.Scanner;

/**author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/09/28
 * Brief instruction: This program is teacher's grade system.
 * version 2
 */
public class Student_Grade_StevenJin {

    public static void main(String[] args) {
        
        System.out.println("Welcome to Power Teacher!!!");
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter the number of students: ");
        int student = input.nextInt();
        System.out.println("\nThe score of assignment must between 0-100");
        System.out.println("Type -1 to the score means you want to change to nest student");
        for(int a=1; a <= student;a++)
        {   
            System.out.println("\nstudents "+ a);
            double sum=0.0;
            int ass;
            for (ass=1;;ass++)
            {
            System.out.print("assignment "+ ass +":");
            double score=input.nextDouble();
             if (score<=100&&score>=0)
                 {sum += score;
                 continue;}
             else if(score==-1)
                 break;
             else
                 System.out.print("\nInvalid input");
                 break;
            }
            double average= sum/(ass-1);
            System.out.println("\naverage:"+ average); 
        }
        System.out.println("\nThanks for using Power Teacher System!!!");
    }
    
}
