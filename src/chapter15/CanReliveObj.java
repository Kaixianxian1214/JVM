package chapter15;

public class CanReliveObj {
    public static CanReliveObj obj;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用当前类重写的finalize()方法");
        obj = this;
    }

    public static void main(String[] args) {
        try{
            obj = new CanReliveObj();
            obj = null;
            System.gc();
            System.out.println("第1次gc");
            Thread.sleep(2000);
            if(obj == null){
                System.out.println("obj is dead");
            }else{
                System.out.println("obj is still alive");
            }
            obj = null;
            System.out.println("第2次GC");
            if(obj == null){
                System.out.println("obj is dead");
            }else{
                System.out.println("obj is still alive");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
