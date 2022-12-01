public class Start {
    public static void main(String[] args) {
        //CREATING OBJECT
        Student student1=new Student("Gaetano","Trefiletti",143,2);
        Professor professor1=new Professor("Franco","Rossi",1324,"Java");
        Assistant assistant1=new Assistant("Riccardo","Poretti",43221,true);
        //METHOD
        student1.goToCollege();
        professor1.goToCollege();
        assistant1.goToCollege();
        //ABSTRACT METHOD
        student1.studyAtHome();
        professor1.teachToOtherPeople();
        assistant1.studyAtHome();
        assistant1.teachToOtherPeople();
    }
}
