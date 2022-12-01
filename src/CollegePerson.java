public class CollegePerson {
    //VARIABLES
    public String name;
    public String surname;
    public int collegeId;
    //METHOD
    public CollegePerson(String name,String surname,int collegeId){
        this.name=name;
        this.surname=surname;
        this.collegeId=collegeId;
    }

    public void goToCollege(){
        System.out.println(name+" "+surname+" "+collegeId);
    }
}
