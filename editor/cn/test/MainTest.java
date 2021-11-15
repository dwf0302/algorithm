package editor.cn.test;

import java.util.Arrays;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("111", "222", "333", "444");

        strList.remove("333");
        System.out.println(strList);
    }
}
