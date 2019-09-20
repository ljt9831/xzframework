    public class Test {

    public final int userId = 0;

    private int a;

    private String userName;

    public Test(Test test){

        if(this == test){
            System.out.println("对象已经初始化");
        }
        System.out.println("对象初始化");
//        throw new RuntimeException();
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        fansheTest1();
    }

    public static void fansheTest2() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Object test = Class.forName("Test");

        Test testObj = (Test) ((Class) test).newInstance();

        testObj.userName = "测试反射";

        System.out.println(testObj.userName);
    }

    public static void fansheTest1(){
        Test test = null;
        try{
            test = new Test(test);
            test.userName = "测试反射";
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            System.out.println(test.userName);
        }
    }

    public static void switchTest(){
        long l1 = 112233445566778899l;
        long l2 = 123456789012345678l;
        long l3 = 876543210987654321l;
        long[] arrayLong = {l1,l2,l3};
        double[] arrayDouble = {1.0d,2.0d,3.8d};
        for(double ll:arrayDouble){
            System.out.println("ll = "+ll);
            switch ((int)ll){
                case 1:System.out.println("case = "+1);break;
                case 2:System.out.println("case = "+2);break;
                case 3:System.out.println("case = "+3);break;
                default:System.out.println("case = default");
            }
        }
    }

    private int changeA() {
        try {
            a = 1;
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            a++;
        }
        return a;
    }
}
