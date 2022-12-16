public class mock5 {
    public static void main(String[] args){
        int a[]={10, 19, 6, 3, 5};
        int count=0;
       int idx=0;
        for(int i=0;i<a.length;i++){
            int min=a[i];
            for(int j=i;j<a.length;j++){
                if(a[j]<min){
                     min=a[j];
                     idx=j;
                }
            }
            if(a[i]>a[idx]){
                count++;
            
            int temp=a[i];
            a[i]=min;
            a[idx]=temp;
            }
        }
        System.out.println(count);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
       
    }
    }

