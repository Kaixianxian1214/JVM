package chapter2;


// 默认：18992
public class StackOverFlowTest {
    public static int count = 0;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
