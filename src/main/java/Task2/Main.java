package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
   public static Set<Student> students = new HashSet<>();
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите информацию о студенте: ФИО, номер группы, номер студенческого билета");
        while (true){
            try {
                String str = bufferedReader.readLine();
                if(str.equalsIgnoreCase("end")){
                    Iterator<Student> it = students.iterator();
                    while (it.hasNext()){
                        Student stud = it.next();
                        System.out.printf("ФИО: %s номер группы: %s номер студенческого билета: %s\n",stud.getName(),stud.getGroup(),stud.getStudentId());
                    }
                    break;
                }
                String[] str2 = str.split(" ");
                addStudent(new Student(str2[0]+" "+str2[1]+" "+str2[2],str2[3],str2[4]));
                System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void addStudent(Student student){
        if(students.isEmpty()){
            students.add(student);
        }
        else {
            Iterator<Student> it = students.iterator();
            while (it.hasNext()) {
                Student stud = it.next();
                if (!stud.equals(student)) { // or stud.hashCode() != student.hashCode()
                    students.add(student);
                } else {
                    System.err.println("Нельзя повторять номер студенческого билета");
                    System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
                }
            }
        }
    }
}