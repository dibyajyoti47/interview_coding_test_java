package tests.applied_materials;
//predict the output
public class MultiThreadingProblem2 {
    public static void main(String[] args) {
        new NewThread2();
    }
}

class NewThread2 implements Runnable {
    Thread t1, t2;
    NewThread2 () {
        t1 = new Thread(this, "My Thread 1");
        t2 = new Thread(this, "My Thread 2");
        t1.start();
        t2.start();
    }
    public void run () {
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.equals(t2));
    }
}