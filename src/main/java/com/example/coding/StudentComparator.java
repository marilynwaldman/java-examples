import java.util.*;

class Student {
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }    
}
   

class MyGPAComp implements Comparator<Student>{
 
    @Override
    public int compare(Student s1, Student s2) {
        double g1 = s1.getCgpa();
        double g2 = s2.getCgpa();
        if(g1 < g2){
            return 1;
        } else if (g2 < g1){
            return -1;
        }
        else { 
            return compareName(s1,s2);
        }    
    }
    
    public int compareName(Student s1, Student s2){
        String f1 = s1.getFname();
        String f2 = s2.getFname();
    
    
        int result = f1.compareTo(f2);
           
        if(result == 0){
            return compareId(s1, s2);
        }    
        else { 
            return result;
        } 
        
    }
    
    public int compareId(Student s1, Student s2){
        int id1 = s1.getId();       
        int id2 = s2.getId();
        
        if(id1 < id2){
            return 1;
        } else if (id2 < id1){
            return -1;
        }
        else { 
            return 0;
        }
    
    
        
        
    }
}



//Complete the code
public class StudentComparator
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
         Collections.sort(studentList, new MyGPAComp());
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}

