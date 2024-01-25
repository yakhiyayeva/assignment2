public class Student extends Person { //Inheritance
    private double gpa;
//Default constructor
    public Student() {
        super();
    }
//Parametrized cons which takes 3 arguments
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }
// Getters
    public double getGpa() {
        return gpa;
    }
//Setter
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
//Polymorphism
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        return gpa > 2.67 ? 36660.00 : 0.0;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
