package homework2;


import java.util.Arrays;
import java.util.Comparator;

public class Group {
    private Student[] listStudents = new Student[10];



    @Override
    public String toString() {
        Arrays.sort(listStudents, studentComparator);

        return "Students=" + Arrays.toString(listStudents) +
                '}';
    }

    public void addStudent (Student student){

               for (int i = 0; i < listStudents.length; i++) {
                       if (listStudents[i] == null) {
                       listStudents[i] = student;
                       System.out.println(listStudents[i] + " ");

                       return;
                   }
               }
               try{
                   throw new GroupException("Can't add "+ student +". Students list is full");
               } catch (GroupException e){
                   System.out.println(e.getMessage());
               }

    }

    public void deleteStudent (Student student){
        for (int i=0; i<listStudents.length; i++){
            if (listStudents[i]!=null && listStudents[i].equals(student)){
                listStudents[i]=null;
                System.out.println(student+ " deleted from list");
            }
        }
    }

    public String findStudent (Student student){
        for (int i = 0; i < listStudents.length; i++) {
            if (listStudents[i]!=null && listStudents[i].getSurname().equals(student.getSurname())){
              //  System.out.println("Student " + student + " found");
                return "Student " + student + " found";
            }
        }
        return "Can't find " + student;
    }

    Comparator<Student> studentComparator = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            if (student1==null && student2==null){
                return 0;
            }
            if (student1 == null) {
                return -1;
            }
            if (student2==null){
                return 1;
            }
            if (student1.getSurname()==null && student2.getSurname()==null){
                return 0;
        }
            if (student1.getSurname() == null) {
            return -1;
        }
            if (student2.getSurname()==null){
            return 1;
        }
            return student1.getSurname().compareTo(student2.getSurname());
        }
    };


//    Comparable<Student> sortStud = new Comparable<Student>() {
//
//        @Override
//        public int compareTo(Student o) {
//
//            return 0;
//        }
//    }

}
