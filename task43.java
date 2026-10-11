class ThreadSafeSingleton {
    // Volatile instance ensures visibility across threads in multithreaded environments
    private static volatile ThreadSafeSingleton instance;

    // Private constructor prevents direct instantiation
    private ThreadSafeSingleton() {
        System.out.println("Singleton Instance Created!");
    }

    // Thread-safe getter with Double-Checked Locking
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}

public class task43 {
    public static void main(String[] args) {
        System.out.println("Calling getInstance() 5 times:");
        for (int i = 1; i <= 5; i++) {
            ThreadSafeSingleton obj = ThreadSafeSingleton.getInstance();
            System.out.println("Call " + i + " reference: " + obj);
        }
    }
}