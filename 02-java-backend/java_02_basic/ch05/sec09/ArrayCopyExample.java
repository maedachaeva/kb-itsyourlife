package java_02_basic.ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        // oldStrArray를 newStrArray 배열(요소가 5개임)로 복사하세요.
        // System.arraycopy를 이용해 복사함
        // for문을 이용해서 다음과 같이 각 요소를 출력함
        // java, array, copy, null, null,

        String[] oldStrArray = { "java", "array", "copy" };
        String[] newStrArray = new String[5];

        // 복사
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        // 출력
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.printf(newStrArray[i] + ", ");
        }
    }
}
