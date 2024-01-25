public class Person implements Payable,Comparable<Person>{ //Base class
    private static int count=1;
    private final int id;
    private String name;
    private String surname;
    //Default constructor
    public Person(){
        this.id=count++;
    }
    //Parametrized constructor which has 2 parameters:name and surname
    public Person (String name,String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }
    //Getters and Setters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
//Polymorphism
    @Override
    public String toString(){
        return id+ "."+ " "+ name+ " " +surname;
    }

    @Override
    public double getPaymentAmount(){
        return 0.0;
    }

    @Override
    public int compareTo(Person other){
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
