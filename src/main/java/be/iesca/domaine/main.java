package be.iesca.domaine;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        System.out.println(map.putIfAbsent("1", "TEST1"));
       // System.out.println(map.putIfAbsent("1", "TEST2"));
        System.out.println(map.remove("1"));
        System.out.println(map);
    }
}
