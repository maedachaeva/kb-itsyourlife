package java_10_basic.ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coins = new Stack<>();

        coins.push(new Coin(100));
        coins.push(new Coin(50));
        coins.push(new Coin(500));
        Coin push = coins.push(new Coin(10));

        while (!coins.isEmpty()) {
            System.out.println("꺼내온 동전 : " + coins.pop().getValue() + "원");
        }
    }
}
