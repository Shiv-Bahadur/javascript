import java.util.*;

 public class quickSort {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ar[]=new int[N];
        for(int i=0;i<N;i++){
            ar[i]=sc.nextInt();
        }
      
        int c[]=mergeSort(ar,0,ar.length-1);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
    
    public static int[] mergeSort(int arr[],int start,int end){
        if(start==end){
            int a[]=new int[1];
            a[0]=arr[start];
            return a;
        }

           int mid=(start +end)/2;
           int arr1[]=mergeSort(arr,start,mid);
           int arr2[]=mergeSort(arr,mid+1,end);
           int a[]=merge(arr1,arr2);
           return a;
    }
    public static int[] merge(int a[],int b[]){
                 int i=0,j=0,k=0;
                 int c[]=new int[a.length+b.length];
                 while(i<a.length && j<b.length){
                    if(a[i]>=b[j]){
                        c[k]=b[j];
                        j++;
                        k++;
                    }else{
                        c[k]=a[i];
                        i++;
                        k++;
                    }
                 }
                 while(i<a.length){
                    c[k]=a[i];
                    i++;
                    k++;
                 }
                 while(j<b.length){
                    c[k]=b[j];
                    j++;
                    k++;
                 }
                 return c;
    }
}
