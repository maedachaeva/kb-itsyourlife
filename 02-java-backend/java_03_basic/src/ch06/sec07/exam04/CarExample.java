package java_03_basic.src.ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        /** Q. Car 클래스 이용하여 아래 출력 형식 지키기
         * car1.company : 현대자동차
         *
         * car2.company : 현대자동차
         * car2.model : 자가용
         *
         * car3.company : 현대자동차
         * car3.model : 자가용
         * car3.color : 빨강
         *
         * car4.company : 현대자동차
         * car4.model : 택시
         * car4.color : 검정
         * car4.maxSpeed : 200
         * */

        // 생성자를 쓰면 객체마다 다른 값을 유연하게 넣을 수 있음
        Car car1 = new Car();
        System.out.println("car1.company : " + car1.company + "\n");

        Car car2 = new Car("자가용");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model + "\n");

        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color + "\n");

        Car car4 = new Car("택시", "검정", 200);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
    }
}
