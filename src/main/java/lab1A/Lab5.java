
/**
 * Write a description of class Lab5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Lab5
{
    public static void main(String[]arg){
        char a,d,c;
        
        Scanner input = new Scanner(System.in);
        while(true){
            d = input.next().charAt(0);
            c = input.next().charAt(0);
            a = Character.isLetter(d) && Character.isLetter(c) && c > d ? (char)(c + d) : 0x0470;
            System.out.println("A is:" + a);
            System.out.println("D is:" + d);
            System.out.println("C is:" + c);
        }
    }
}
