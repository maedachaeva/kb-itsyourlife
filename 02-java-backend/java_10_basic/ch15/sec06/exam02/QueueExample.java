package java_10_basic.ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // LinkedList를 큐로 이용
        Queue<Message> messageQueue = new LinkedList<>();

        // Message 인스턴스를 다음 순(command, to)으로 추가
        // 추가하는 방법으로 offer랑 add가 있는데 offer는 실패시 false를 반환하느로 offer 추천
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "신용권"));
        messageQueue.offer(new Message("sendKakaotalk", "감자바"));

        // 큐가 빌 때까지 큐에서 Message를 추출하며 command에 따라 다음과 같이 출력
        while (!messageQueue.isEmpty()) {
            // 빼내는 건 poll이랑 remove가 있는데 poll이 안정적
            Message message = messageQueue.poll();
            
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
