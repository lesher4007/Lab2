package exercise1;

public class Main {
    public static void main(String[] args) {


        Person teacher1 = new Teacher("Ronald", "Turner", GenderType.M, "Computer science", Teacher.AcademicDegree.PhD, "Programming paradigms");
        Person teacher2 = new Teacher("Ruth", "Hollings", GenderType.F, "Jurisprudence", Teacher.AcademicDegree.MSc, "Domestic arbitration");

        Person student1 = new Student.BachelorAndMaster("Leo", "Wilkinson", GenderType.M, "Computer science", Student.BachelorAndMaster.Stage.BACHELOR, Student.BachelorAndMaster.Course.III);
        Person student2 = new Student.BachelorAndMaster("Anna", "Cunningham", GenderType.F, "World economy", Student.BachelorAndMaster.Stage.BACHELOR, Student.BachelorAndMaster.Course.I);
        Person student3 = new Student.BachelorAndMaster("Jill", "Lundqvist", GenderType.F, "Jurisprudence", Student.BachelorAndMaster.Stage.MASTER, Student.BachelorAndMaster.Course.I);

        Student.Graduate student4 = new Student.Graduate("Ronald", "Correa", GenderType.M, "Computer science", "Design of a functional programming language");

        Person[] persons = new Person[]{teacher1, teacher2, student1, student2, student3, student4};



        Person.printAll(persons);






    }


}
