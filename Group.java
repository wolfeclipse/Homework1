package homework2;


import java.util.Arrays;

public class Group {
    private Student[] listStudents = new Student[10];


    @Override
    public String toString() {
     // Arrays.sort(listStudents );

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



}
