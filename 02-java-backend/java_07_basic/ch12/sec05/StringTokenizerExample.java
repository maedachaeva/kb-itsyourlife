package java_07_basic.ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        // split 메서드로 data1에서 이름 추출
        // String Tokenizer로 data2에서 이름 추출
        
        String data1 = "홍길동&이수홍,박연수";
        String[] names1 = data1.split("&|,");
        for (String name1 : names1) {
            System.out.println(name1);
        }

        System.out.println();

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer names2 = new StringTokenizer(data2, "/");
        while (names2.hasMoreTokens()) {
            String name2 = names2.nextToken();
            System.out.println(name2);
        }
    }
}
