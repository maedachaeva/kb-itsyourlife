package java_08_advanced.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        MovieThread movieThread = new MovieThread();
        // Thread 상속했으니까 바로 start
        movieThread.start();

        MusicRunnable musicRunnable = new MusicRunnable();
        Thread musicThread = new Thread(musicRunnable);
        // Runnable 구현했으니까 Thread에 태워서 start
        musicThread.start();
    }
}
