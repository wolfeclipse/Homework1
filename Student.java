package homework1;

import java.util.Scanner;

public class Student extends Human implements Comparable<Student>{
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

    @Override
    public int compareTo(Student student) {

            Scanner sc = new Scanner(System.in);
            System.out.println("How would you like to sort the list?");
            System.out.println("1 - sort by hair; 2 - sort by sex; 3 - sort by heigth; 4 - sort by age; 5 - sort by name; 6 - sort by surname");
            System.out.println("Input number to sort: ");
            int number = sc.nextInt();

            switch (number){
                case 1: if (student.getHair().equals(this.getHair())) return 0;
                    if (this.getHair().charAt(0)>student.getHair().charAt(0)) return 1;
                    return -1;
                break;
                case 2:if (student.getSex().equals(this.getSex())) return 0;
                    if (this.getSex().charAt(0)>student.getSex().charAt(0)) return 1;
                    return -1;
                break;
                case 3:if (student.getHeigth()==(this.getHeigth())) return 0;
                    if (this.getHeigth()>student.getHeigth()) return 1;
                    return -1;
                break;
                case 4:if (student.getAge()==this.getAge()) return 0;
                    if (this.getAge()>student.getAge()) return 1;
                    return -1;
                break;
                case 5: if (student.getName().equals(this.getName())) return 0;
                    if (this.getName().charAt(0)>student.getName().charAt(0)) return 1;
                    return -1;
                break;
                case 6:
                    if (student.getSurname().equals(this.getSurname())) return 0;
                    if (this.getSurname().charAt(0) > student.getSurname().charAt(0)) return 1;
                    return -1;
                    break;
            }


//            if (number==1){
//                    if (student.getHair().equals(this.getHair())) return 0;
//                    if (this.getHair().charAt(0)>student.getHair().charAt(0)) return 1;
//                    return -1;
//            }
//            if (number==2){
//                if (student.getSex().equals(this.getSex())) return 0;
//                if (this.getSex().charAt(0)>student.getSex().charAt(0)) return 1;
//                return -1;
//            }
//            if (number==3){
//
//                if (student.getHeigth()==(this.getHeigth())) return 0;
//                if (this.getHeigth()>student.getHeigth()) return 1;
//                return -1;
//            }
//            if (number==4){
//                if (student.getAge()==this.getAge()) return 0;
//                if (this.getAge()>student.getAge()) return 1;
//                return -1;
//            }
//            if (number==5){
//                if (student.getName().equals(this.getName())) return 0;
//                if (this.getName().charAt(0)>student.getName().charAt(0)) return 1;
//                return -1;
//            }
//            if (number==6){
//                if (student.getSurname().equals(this.getSurname())) return 0;
//                if (this.getSurname().charAt(0) > student.getSurname().charAt(0)) return 1;
//                return -1;
//            }

    }
}
