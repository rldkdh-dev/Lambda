import java.io.FileNotFoundException;


class BackendApplicationTests {


    public static void main(String[] args) throws FileNotFoundException {
        int a = 100;
        final int b = 200;
        String str1 = "안녕하세요";
        int z = 0;
        Runnable runnable = () -> System.out.println(str1);
        runnable.run();
    }
}