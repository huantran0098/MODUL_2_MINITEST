package week3.model;

public class Student extends Person{
    private double mathPoint;
    private double physicsPoint;
    private double chemistryPoint;


    public Student(String name, int age, double mathPoint, double physicsPoint, double chemistryPoint) {
        super(name, age);
        this.mathPoint = mathPoint;
        this.physicsPoint = physicsPoint;
        this.chemistryPoint = chemistryPoint;
    }

    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public double getPhysicsPoint() {
        return physicsPoint;
    }

    public void setPhysicsPoint(double physicsPoint) {
        this.physicsPoint = physicsPoint;
    }

    public double getChemistryPoint() {
        return chemistryPoint;
    }

    public void setChemistryPoint(double chemistryPoint) {
        this.chemistryPoint = chemistryPoint;
    }

    public double getAveragePoint(){
        return (this.getMathPoint() + this.getChemistryPoint() + this.getPhysicsPoint()) / 3;
    }
    @Override
    public String toString() {
        return  super.toString() +
                ", mathPoint=" + mathPoint +
                ", physicsPoint=" + physicsPoint +
                ", chemistryPoint=" + chemistryPoint + ']';

    }
}
