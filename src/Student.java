public class Student extends CollegePerson implements ILearningPerson{
    //VARIABLES
    private int academicYear;
    //METHOD
    public Student(String name,String surname,int collegeId,int academicYear) {
        super(name,surname,collegeId);
        this.academicYear=academicYear;
    }
    //OVERRIDE ABSTRACT METHOD
    @Override
    public void studyAtHome() {
        System.out.println("The student study at home");
    }
}
