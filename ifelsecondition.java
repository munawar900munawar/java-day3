import java.util.*;
public class ifelsecondition{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a>b)&&(a>c)){
            System.out.println("a is big");
        }
        if((b>a)&&(b>c)){
            System.out.println("b is big");
        }
        if((c>a)&&(c>b)){
            System.out.println("c is big");
        }
    }
}