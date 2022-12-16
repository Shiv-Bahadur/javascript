import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args){
       

        int b[]={12, 45, 32, 45, 65, 77 ,89, 98, 25 ,42, 31 ,65};
        int max=b[0],min=b[0],secondMax=b[0];
        for(int i=0;i<b.length;i++){
             if(max<b[i]){
                max=b[i];
             }
             if(min>b[i]){
                min=b[i];
             }
             
        }
        for(int i=1;i<b.length;i++){
            if(b[i]<max && secondMax<b[i]){
             secondMax=b[i];
            
            }  
        
        }
        System.out.print("max value: "+max+" min value :"+min+ " second max value :"+secondMax);
    }
}
