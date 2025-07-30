
public class Main
{
	public static void main(String[] args) {
	 int marks = 54;
	 
	 if(marks < 25){
	     System.out.println("fail");
	  }else if (marks >= 25 && marks <= 30){
	      System.out.println("Grade : E");
	  }else if (marks >= 31 && marks <= 40){
	      System.out.println("Grade : D");
	 }else if (marks >= 41 && marks <= 50){
	      System.out.println("Grade : c");
	 }else if (marks >= 51 && marks <= 60){
	      System.out.println("Grade : B");
	 }else if (marks >= 61 && marks <= 70){
	      System.out.println("Grade : A");
	}else{
	    System.out.println("invalid marks");
	}
	}
}
