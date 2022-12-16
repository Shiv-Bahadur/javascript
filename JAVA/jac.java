import java.util.Scanner;

public class jac{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long x=sc.nextLong();
    long y=x;
    long val1=0,val2=0;
    
    boolean num1=false,num2=false;
    while(y>0){
        long z=y;
        int count=0;
        while(z>0){
            if((z&1)>0){ count++;}
            z=z>>1;
        }
        if(count==2){ 
            val1=x-y;
            num1=true;
            break;
        }
        y--;
    }
long s=x;

    while(true){
        long z=s;
        int count=0;
        while(z>0){
            if((z&1)>0) count++;
            z=z>>1;
        }
        if(count==2){ 
            val2=s-x;
            num2=true;
            break;
        }
        s++;
    }

if(num1==true & val1<val2) System.out.print(val1);
 else System.out.print(val2);
 }
}