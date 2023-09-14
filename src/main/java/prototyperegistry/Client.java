package prototyperegistry;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student studentCopy = studentRegistry.get("sept_14_batch").copy();
        studentCopy.setName("whatever you want...");
        System.out.println(studentCopy);

        Student originalIntStudent = studentRegistry.get("intelligent_student_batch").copy();


    }

    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student original = new Student();
        original.setBatch("AUGUST");
        original.setAverageBatchPsp(10);
        studentRegistry.register("sept_14_batch", original);


        Student original2 = new Student();
        original2.setBatch("OCTOBER");
        original2.setAverageBatchPsp(80);
        studentRegistry.register("oct_14_batch", original2);


        Student intelligentStudent = new IntelligentStudent();
        intelligentStudent.setBatch("OCTOBER");
        intelligentStudent.setAverageBatchPsp(80);
        studentRegistry.register("intelligent_student_batch", intelligentStudent);

    }
}
