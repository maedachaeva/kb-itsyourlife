package java_04_basic.ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calculatorResult = new Calculator();
        Computer computerResult = new Computer();

        System.out.println(calculatorResult.areaCircle(2));
        System.out.println(computerResult.areaCircle(2));
    }
}
