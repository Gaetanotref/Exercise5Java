public class Assistant extends CollegePerson implements ITeachingPerson,ILearningPerson {
    //VARIABLES
    public boolean isGoingToBeAPhD;
    //OVERRIDE METHOD
    @Override
    public void teachToOtherPeople() {
        System.out.println("The assistant teach to other people");
    }
    //OVERRIDE METHOD
    @Override
    public void studyAtHome() {
        System.out.println("The assistant study at home");
    }
    //METHOD
    public Assistant(String name,String surname,int collegeId,boolean isGoingToBeAPhD){
        super(name, surname, collegeId);
        this.isGoingToBeAPhD=isGoingToBeAPhD;
    }
}
