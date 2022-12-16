import java.util.Scanner;

class Main{
   
    public static void main(String[] args){
        
        
       AdderIII obj=new AdderIII(4,5);
       System.out.println(obj.add());
       System.out.println(obj.add(1,2));
       System.out.println(obj.add(1,2,3));
    }

    
    }
interface Adder{
public int add();
public int add(int a,int b);
public int add(int a,int b,int c);
}
class AdderIII implements Adder{
    int num1;
    int num2;
    AdderIII(){
        num1=0;
        num2=0;
    }
    AdderIII(int a,int b){
        num1=a;
        num2=b;
    }
    public int add(){
        return num1+num2;
    }
    public int add(int a,int b){
        return a*a+b*b;
    }
    public int add(int a,int b,int c){
        return a*num1+b*num2-c*c;
    }

}