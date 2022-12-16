import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a[]=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
       int b[]= sort(a);
       for(int i=0;i<b.length;i++)
       System.out.print(b[i]+" ");
    }
    public static int[] sort(int a[]){
            for(int i=1;i<a.length;i++){
                int key=a[i];
                int j=i-1;
                while(j>=0 && a[j]>key){
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=key;
            }
            return a;
    }
}
