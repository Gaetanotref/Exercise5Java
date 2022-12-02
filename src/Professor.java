public class Professor extends CollegePerson implements ITeachingPerson{
    //VARIABLES
    private String teachingSubject;
    //METHOD
    public Professor(String name, String surname, int collegeId,String teachingSubject) {
        super(name, surname, collegeId);
        this.teachingSubject=teachingSubject;
    }
    //OVERRIDE METHOD
    @Override
    public void teachToOtherPeople() {
        System.out.println("The professor teach to other people");
    }
}
