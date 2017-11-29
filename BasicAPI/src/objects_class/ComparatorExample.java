package objects_class;

import java.util.*;


public class ComparatorExample {

   public static void main(String[] args) {
      Student s1 = new Student(1);
      Student s2 = new Student(1);
      Student s3 = new Student(2);
      
      int result  = Objects.compare(s1, s2, new StudentComparator());
      System.out.println(result);
      
      result  = Objects.compare(s3, s1, new StudentComparator());
      System.out.println(result);
      //a, b
      //비교방법(학생번호가 적으면 음수 /학생번호가 같으면 0 /학생번호가 크면 양수로 나타낸다)
      //비교자 클래스 하나를 작성한다.

   }
   
   static class Student{
      int sno;
      Student(int sno) {
         this.sno = sno;
      }
   }
   
   static class StudentComparator implements Comparator <Student> {

      @Override
      public int compare(Student a, Student b) {
         if(a.sno < b.sno) return -1;
         else if(a.sno == b.sno) return 0;
         else return 1;         
         //return Integer.compare(a.sno, b.sno);
      }      
   }
}
