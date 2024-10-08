import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
//
//        for(String key : map.keySet()){
//            System.out.println(map.get(key));
//        }

        for(int i = 0; i < s.length()-1; i++) {

            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }

            if(i + 3 > s.length()) {
                result += map.get(s.charAt(i+1));
            }
        }



        return result;
    }
}
