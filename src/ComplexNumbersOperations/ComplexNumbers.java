package ComplexNumbersOperations;

public class ComplexNumbers {
    double real;
    double image;

    public void add(ComplexNumbers num) {
        this.real += num.real;
        this.image += num.image;


    }

    public void subtract(ComplexNumbers num) {
        this.real -= num.real;
        this.image -= num.image;
    }
}
