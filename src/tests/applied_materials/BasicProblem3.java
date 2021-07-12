package tests.applied_materials;

public class BasicProblem3 extends Derived{

    /*protected final void getDetails () {
        System.out.println("Derived Class");
    }*/

    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.getDetails();
    }
}

class Derived {
    protected final void getDetails () {
        System.out.println("Derived Class");
    }
}