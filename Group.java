package homework2;


import java.util.Arrays;

public class Group {
    private Student[] listStudents = new Student[10];
    private boolean isEmpty;
    @Override
    public String toString() {
        return "Students=" + Arrays.toString(listStudents) +
                '}';
    }

    public void addStudent (Student student){
           if (isEmpty=true) {
               for (int i = 0; i < listStudents.length; i++) {
                       if (listStudents[i] == null) {
                       listStudents[i] = student;
                       System.out.println(listStudents[i] + " ");
                       isEmpty=true;
                       return;
                   }
               }
               try{
                   throw new GroupException("Can't add "+ student +". Students list is full");
               } catch (GroupException e){
                   System.out.println(e.getMessage());
               }
           }
    }

    public void deleteStudent (Student student){
        for (int i=0; i<listStudents.length; i++){
            if (listStudents[i].equals(student)){
                listStudents[i]=null;
                System.out.println(student+ " deleted from list");
            }
        }
    }
//student.equals(listStudents[i])
    public boolean findStudent (Student student){
        for (int i = 0; i < listStudents.length; i++) {
            if (listStudents[i].equals(student)){
                System.out.println("Student " + student + " found");
                return true;
            }
        }
        System.out.println("Can't find "+ student);
        return false;
    }


}
