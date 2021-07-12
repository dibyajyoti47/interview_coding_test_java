package tests.applied_materials;

public class InterFaceProblem2 implements OuterInterface.InnerInterface, OuterInterface {

    public void InnerMethod() {
        System.out.println(100);
    }

    public static void main(String[] args) {
        InterFaceProblem2 obj = new InterFaceProblem2();
        obj.InnerMethod();
    }
}

interface OuterInterface {
    public void InnerMethod();
    public interface InnerInterface {
        public void InnerMethod();
    }

}