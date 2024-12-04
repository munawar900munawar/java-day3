import java.util.*;
public class smallestof3num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a<b)&&(a<c)){
            System.out.println("a is smaller");
        }
        if((b<a)&&(b<c)){
            System.out.println("b is smaller");
        }
        if((c<a)&&(c<b)){
            System.out.println("c is smaller");
        }
    }
}