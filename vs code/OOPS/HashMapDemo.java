import java.util.*;

public class HashMapDemo {

public static void main(String args[]) {

// Create a hash map

HashMap<String,Double> hm = new HashMap<String,Double>();

// Put elements to the map

hm.put("John Doe", 3434.34);

hm.put("Tom Smith", 123.22);

hm.put("Jane Baker", 1378.00);

hm.put("Tod Hall", 99.22);

hm.put("Ralph Smith", -19.08);


System.out.println(hm);

hm.replace("Tod Hall",123.456);

System.out.println(hm);

System.out.println(hm.size());

hm.remove("Ralph Smith");

System.out.println(hm);

hm.clear();

System.out.println(hm);

}

}
