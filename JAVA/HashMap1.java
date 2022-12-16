import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args){
        int a[]={1, 0 ,0 ,1, 0 ,1 ,1};
        System.out.println(noOfEqual0and1(a));
    }
    public static int noOfEqual0and1(int[] a){
        int count=0;
        int ps=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0) a[i]=-1;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,0);
        for(int i=0;i<a.length;i++){
          ps=ps+a[i];
          if(map.containsKey(ps)==false){
            map.put(ps,1);
          }
          if(map.containsKey(ps)){
            int c=map.get(ps);
            count=count+c;
            map.put(ps,c+1);
          }
        }
        return count;
    }
}
