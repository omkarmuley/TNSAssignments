import java.util.*;

public class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name :");
    String name = sc.nextLine();
    System.out.println("enter rollno: ");
    int rollno = sc.nextInt();
    System.out.println("enter grade:");
    char grade = sc.next().charAt(0);
    System.out.println("enter percentage:");
    double percentage = sc.nextDouble();
    
    System.out.println(name);
    System.out.println(rollno);
    System.out.println("'"+grade+"'");
    System.out.println(percentage+"%");
  }
}