import java.util.HashMap;
import java.util.Map.Entry;


public class mock1 {
    public static void main(String[] args) {
        String st="aaaabbbfjdg";
        HashMap<Character,Integer> hs=new HashMap<>();

        for(int i=0;i<st.length();i++){

            char ch=st.charAt(i);

            if(hs.containsKey(ch)){

                int count=hs.get(ch);
                hs.put(ch,count+1);
            }else
            hs.put(ch,1);
        }
        int max=0;
        int secondMax=0;
        char ch=' ';
        for(Entry<Character, Integer> e:hs.entrySet()){
                
                int val=e.getValue();
                if(val>max) max=val;
        }
        for(Entry<Character, Integer> e:hs.entrySet()){
            int val=e.getValue();
            if(val<max && val>secondMax){
                secondMax=val;
                ch=e.getKey();
            } 
    }
        System.out.println(ch+" "+secondMax);
    }
}
