package GetToAClass;

public class GetToAClass {

    class A {
        int i = 1;
    }

    class B extends A{
        int i = 2;
    }

    class C extends B{
        int i = 3;
        void f() {
            System.out.println(this.i);
            System.out.println(super.i);
            A a = this;
            System.out.println(((A)this).i);
        }
    }


}
