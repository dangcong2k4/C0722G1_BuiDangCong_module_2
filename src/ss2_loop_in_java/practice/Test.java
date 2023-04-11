package ss2_loop_in_java.practice;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
//        String[] str = {""};
//        String[] str = {"a"};
        System.out.println(Test.groupAnagrams(str));
    }
    public static List<List<String>> groupAnagrams(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str1 : str) {
            char[] chars = str1.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str1);
        }
        return new ArrayList<>(map.values());
    }

}
