package chapter13;
import java.util.*;
public class test {
    public static void main(String[] args) {
        String str = "nowcoder. a am I";
        String[] strArr = str.split(" ");
        List<String> strList = new ArrayList<>();
        strList = Arrays.asList(strArr);
        Collections.reverse(strList);
        System.out.println(strList);
    }
}
