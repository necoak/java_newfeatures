import java.util.ArrayList;
import java.util.Arrays;

public class KnockJEP286 {
    public static void main(String[] args) {
        var hellotext = "Hello";
        System.out.println(hellotext);

        // var array = {"abc", "def"}; // 配列初期化は型推論できなかった..
        String[] strs = {"abc", "def"};
        var array = Arrays.asList(strs);
        System.out.println(array);


        var obj = new Object() {
            public int a;
            public int b;
        };
        obj.a = 1;
        obj.b = 2;
        System.out.println(obj);
        System.out.println("obj.a=" + obj.a + ", obj.b=" + obj.b);
    }
}
