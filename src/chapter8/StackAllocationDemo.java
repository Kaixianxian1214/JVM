package chapter8;

public class StackAllocationDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for(int i = 0; i < 1000000; i++){
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费时间：" + (end - start) + "ms");

        try{
            Thread.sleep(1000000);
        }catch(InterruptedException e1){
            e1.printStackTrace();
        }
    }

    private static void alloc(){
        User user = new User();
    }

    static class User {

    }
}
