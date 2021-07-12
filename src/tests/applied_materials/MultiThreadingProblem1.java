package tests.applied_materials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// predict the output
public class MultiThreadingProblem1 {
    public static void main(String[] args) {
        new NewThread();
    }
}

class NewThread implements Runnable {
    Thread t;
    NewThread() {
        t = new Thread(this, "My Thread");
        t.start();
    }
    @Override
    public void run() {
        System.out.println((t.getName()));
    }
}