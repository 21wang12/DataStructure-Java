package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Person> s = new HashSet<>();
        Person p1 = new Person(20,"wang");
        s.add(p1);
        Person p2 = new Person(20,"wang");
        s.add(p2);
        System.out.println("set:"+s);
        HashMap<String,String> hm = new HashMap<>();
        List<List<Integer>> ll = new ArrayList<>();
    }
}
