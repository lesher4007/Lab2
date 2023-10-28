package exercise1;

public class Person {

    private String name;
    private String surname;
    private GenderType genderType;
    private String faculty;




    public Person(String name, String surname, GenderType genderType, String faculty) {
        setName(name);
        setSurname(surname);
        setGenderType(genderType);
        setFaculty(faculty);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStringGenderType() {
        return genderType.getPronoun();
    }

    public String graduateGender(){
        return genderType.getPronoun2();
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void print(){
    }

    public static void printAll(Person[] array) {
        for (Person person : array) {
            person.print();
        }
    }
}
