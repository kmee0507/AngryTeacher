import java.util.*;
public class AngryTeacher{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a class size and cancellation threshold seperated by a space: ");
      int classSize = sc.nextInt();
      int cancel = sc.nextInt();
      Scanner sc1 = new Scanner(System.in);
      System.out.print("Enter " +classSize+" student arrival times: ");
      String arrivalTimes = sc1.nextLine();
      String[] arrOfTimes = arrivalTimes.split(" ");
      int studentsPresent = 0;
      for(int i = 0; i<arrOfTimes.length;i++){
         if(Integer.parseInt(arrOfTimes[i]) >= 0){
            studentsPresent+=1;
         }
      
      }
      if(studentsPresent >= cancel)
         System.out.println("CLASS IS NOT CANCELLED");
      else
         System.out.println("CLASS IS CANCELLED");

   }
}