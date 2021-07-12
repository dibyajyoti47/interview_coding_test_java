package tests.applied_materials;

public class MutiThreadingProblem3 {
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        t1.start();
        System.out.println("Main");
    }
}

class TestThread extends Thread {
    public void run () {
        System.out.println("Run");
    }
}