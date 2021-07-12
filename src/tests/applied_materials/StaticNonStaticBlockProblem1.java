package tests.applied_materials;

public class StaticNonStaticBlockProblem1 {
    public void myMethod () {
        System.out.println("Method");
    }
    {
        System.out.println("Instance Block");
    }

    public void StaticNonStaticBlockProblem1() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        StaticNonStaticBlockProblem1 obj  = new StaticNonStaticBlockProblem1();
        obj.StaticNonStaticBlockProblem1();
        obj.myMethod();
    }
}
