package tests.applied_materials;

public class MutiThreadingProblem4 {
    public synchronized static void main(String[] args) throws InterruptedException {
        Thread f = new Thread();
        f.start();
        System.out.println("A");
        f.wait(1000);
        System.out.println("B");
    }
}
