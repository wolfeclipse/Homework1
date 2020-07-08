package homework2;



public class Student extends Human{
    private String name;
    private String surname;

    public Student(String hair, String sex, int heigth, int age, String name, String surname) {
        super(hair, sex, heigth, age);
        this.name = name;
        this.surname = surname;
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


    @Override
    public String toString() {
        return name + ' ' + surname;
    }
//
//    @Override
//    public int compareTo(homework1.Student student) {
//        if (student.getSurname().equals(this.getSurname())) return 0;
//        if (this.getSurname().charAt(0) > student.getSurname().charAt(0))
//            return 1;
//
//        return -1;
//
//    }
}