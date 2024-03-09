import java.util.HashMap;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap hm1=new HashMap();
        hm1.put(01, "sachin");
        hm1.put(02, "virat");
        hm1.put(03, "dhoni");
        System.out.println("hashmap1" + hm1);
        //key can be of any type no,sting etc but the order of insertion maybe maintained
        HashMap hm2=new HashMap();
        hm2.put("virat", "sachin");
        hm2.put("dhoni", "virat");
        System.out.println("hashmap2" + hm2);
        //To maintain order of insertion we have to use linkedhashmap
        LinkedHashMap hm3=new LinkedHashMap();
        hm3.put("virat", "sachin");
        hm3.put("dhoni", "virat");
        System.out.println("Linkedhashmap" + hm3);

    }

}
