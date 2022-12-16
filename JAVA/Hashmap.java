


import java.util.*;
import java.util.Map.*;
import java.io.*;


public class Hashmap {
    public static void main(String[] args){
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     map.put(667,45);
    //     map.put(78,85);
    //     map.put(56,5);
    //     map.put(90,405);
    //     System.out.println(map.containsKey(50));
    //    for(Entry<Integer,Integer> e:map.entrySet()){
    //     System.out.println(e.getKey()+" "+e.getValue());
    //    }

       int a[]={4,8,5,4,8,6,4,2,6,7,6,6,2,8,2,8};
       HashMap<Integer,Integer> Hmap=new HashMap<>();
       for(int i=0;i<a.length;i++){
        if(Hmap.containsKey(a[i])){
            int count=Hmap.get(a[i]);
            Hmap.put(a[i],count+1);
        }else{
            Hmap.put(a[i],1);
        }
       }
      int n=Hmap.size();
       System.out.println(n);
       for(int j=0;j<n;j++){
        int max=0;
        int ans=0;
       for(Entry<Integer,Integer> e:Hmap.entrySet()){
                 if(e.getValue()>max){
                    max=e.getValue();
                    ans=e.getKey();
                 }
                
       }
       System.out.print(ans+" ");
       Hmap.remove(ans);
       
    }
    
    }
}
