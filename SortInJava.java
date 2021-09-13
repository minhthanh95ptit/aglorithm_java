import java.util.Arrays;
import java.lang.Comparable;

public class SortInJava {

   static class Student implements Comparable{
      String name;
      int age; 
      public Student(String name, int age){
         this.name = name;
         this.age = age;
      }

      @Override
      public String toString() {
         return "{ name = " + name + ", age = " + age + "}";
      }
   

    
      @Override
      public int compareTo(Object other) {
          // TODO Auto-generated method stub
         Student otherStudent = (Student)other;
         if(this.age == otherStudent.age){
            return 0;
         }else if(this.age > otherStudent.age){
            return 1;
         }
         return -1;
      //    // 0 neu this = other
      //    // 1 neu this > other
      //    // -1 neu this < other
      }
   }
   public static void main(String[] args) {
        //Sort in array
      // int[] intArr = {3,2,1,0};
      // Arrays.sort(intArr);
      // System.out.println(Arrays.toString(intArr));
      // //Sort in string
      // String[] stringArr = {"1","0000","d","3"};
      // Arrays.sort(stringArr);
      // System.out.println(Arrays.toString(stringArr));
      //Sort collection
      // String name;
      // int age;
      Student[] students = { new Student("AAA",20), new Student("BBB",10)};
      
      Arrays.sort(students);
      System.out.println(Arrays.toString(students));
      // System.out.println(students);
   }

}

