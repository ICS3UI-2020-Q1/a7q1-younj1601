
/**
 *Takes an exam percentage and outputs the appropriate letter grade
 * @author Jackson 
 */
public class Main {

  public static void examGrade(int grade){
    if(grade < 50){
      System.out.println("F");
    }else if(grade <= 59 && grade >= 50){
      System.out.println("D");
    }else if(grade <= 69 && grade >= 60){
      System.out.println("C");
    }else if(grade <= 79 && grade >= 70){
      System.out.println("B");
    }else if(grade >= 80){
      System.out.println("A");
    }

  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   
  examGrade(81);  
    
    
  }
}
