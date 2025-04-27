package java_05_basic.ch08.sec04;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    /**
     * setVolume() 메서드
     * - 매개변수 volume 값으로 필드 volume 값으로 설정
     * - 매개변수 volume 값이 최대 볼륨보다 큰 값이면 최대 볼륨으로 설정
     * - 최소 볼륨보다 작은 값이면 최소 볼륨으로 설정
     * - "현재 TV 볼륨: 값" 출력
     * */
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
