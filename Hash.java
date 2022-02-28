import java.util.HashMap;

public class Hash {

    public static void main(String[] args) {

        HashMap<String, Integer> hMap = new HashMap<String, Integer>();

        hMap.put("a", 4);
        hMap.put("b", 5);
        hMap.put("Aditya", 6);
        hMap.put("Akshay", 7);

        System.out.println(hMap);
        /*
         * 
         * System.out.println(hMap.containsValue(5));
         * System.out.println(hMap.remove("b", 2));
         * System.out.println(hMap);
         * 
         * hMap.replace("Aditya" , 3, 500);
         * System.out.println(hMap);
         * System.out.println(hMap.values());
         * System.out.println(hMap.keySet());
         * 
         * 
         */

    }

}