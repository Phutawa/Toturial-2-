package ADT.Tutorial_2;
/*  Phutawan Mueangma    
    672115037
    Program for to SE tutorial 2
*/  

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;
    
    public class Data{
        public static void main(String[] args) throws FileNotFoundException{
            File f = new File("C:\\Users\\CAMT-STD\\Desktop\\SE\\ADT\\Tutorial_2\\class_roaster67.csv"); // your location of .csv
                Scanner input = new Scanner(f) ;
    
                    for(int i = 0 ; i < 7 ; i++ ){
                    input.nextLine();
                    }
    
                Vector<Student> student = new Vector<Student>();
    
                      while(input.hasNextLine()){
                        String dataLine = input.nextLine();
                        StringTokenizer stu = new StringTokenizer(dataLine.trim(),",");
                        stu.nextToken();
                        student.addElement(new Student(stu.nextToken(),stu.nextToken(),stu.nextToken()));
                      }
                    System.out.println("Totak Students are : " + student.size());// how many student
                      for(char i = 'A' ; i <= 'Z' ; i++){
                        DisplayResult(student,i); // detail of student begin with A
                      }
        }
    
        public static void DisplayResult(Vector<Student> student,char Alphabet){
            char FirstAlphabet;
                Vector <Student> toString = new Vector<Student>();
                    int countStudent = 0; 
                        String firstName;
    
                            for(int i = 0 ; i < student.size() ; i++){
                                firstName = student.elementAt(i).getfirstName();
                            FirstAlphabet = firstName.charAt(0);

                                if (FirstAlphabet == Alphabet) {
                                    toString.addElement(student.elementAt(i));
                                    countStudent++;
                                }
                }
                                        System.out.println();
                                        System.out.println(Alphabet + " : " + countStudent);

                                        for(Student i : toString){
                                            System.out.println(i);
                                }

                }

}
