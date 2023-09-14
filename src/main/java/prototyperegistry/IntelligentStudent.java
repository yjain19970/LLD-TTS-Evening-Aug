package prototyperegistry;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }

    /**
     *
     *
     * FLOW:
     *
     * IS ->copy() --> IS(constructor)--> Student(constructor) --> wil create object for student
     * --> IS constructor will be called. --> initialise the values
     *
     *
     */
}
