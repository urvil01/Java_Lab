//self
import java.util.*;
import java.util.Scanner;

class student{
    String name;
    int id;
    int phoneNo;
}
class second {
    
    public static void main(String[] args) {
      student s = new student();
       Scanner sc = new Scanner(System.in);
        s.name = sc.next();
        s.id = sc.nextInt();
        s.phoneNo = sc.nextInt();
        System.out.println("Your Name is:"+s.name);
        System.out.println("Your Id is:"+s.id);
        System.out.println("Your mobile no is:"+s.phoneNo);
      
    }
}
