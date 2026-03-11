import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student{
    int id;
    String name;
    double marks;
}

class StudentManager extends Student{
    void writeStudent(){
        Scanner sc = new Scanner(System.in);
        this.id = sc.nextInt();
        this.name = sc.next();
        this.marks = sc.nextDouble();

        try {
            FileWriter fw = new FileWriter("students.txt", false);
            fw.write("ID: " + this.id + ", Name: " + this.name + ", Marks: " + this.marks + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    void readStudent(){
        File file = new File("students.txt");
        if (!file.exists()) {
            System.out.println("File 'students.txt' does not exist.");
            return;
        }
        
        try {
            FileReader fr = new FileReader("students.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            boolean hasRecords = false;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                hasRecords = true;
            }
            if (!hasRecords) {
                System.out.println("No records found");
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}

public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.writeStudent();
        sm.readStudent();
    }
}

