package prototyperegistry;

public class Student implements Prototype<Student> {
    private int age=19;
    private String name="Yash";
    private String batch="AUG";
    private double averageBatchPsp;
    private double studentPsp;

    public Student(){}

    public Student(Student s){
        this.averageBatchPsp = s.averageBatchPsp;
        this.studentPsp = s.studentPsp;
        this.batch = s.batch;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    public Student copy(){
       return new Student(this);
    }
}
