package nestech.javacourse.example.multithread;

public class ThreadExample {
    public static void main(String[] args) {
        // Creating a object for first thread and second
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        Thread thread1 = new Thread(firstThread);
        Thread thread2 = new Thread(secondThread);

        thread1.start();
        thread2.start();
    }
}
