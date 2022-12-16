import java.util.HashMap;

public class mock {
    public static void main(String[] args){
        int a[]={1, 4, 20, 3, 10, 5};//1,5,25,28,38,43
        int sum=33;
        int ps=0;
        HashMap<Integer,Integer> map1=new HashMap<>();

        for(int i=0;i<a.length;i++){
           ps=ps+a[i];
           if(map1.containsKey(ps-sum)){
            int idx=map1.get(ps-sum);
            System.out.println(idx+1+" "+i);
           }else{
            map1.put(ps, i);
           }
        }
    }

    
}
