package GetToAClass;

import static java.lang.System.*;

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
            out.println(this.i);
            out.println(super.i);
            A a = this;
            out.println(((A)this).i);
        }
    }


}
