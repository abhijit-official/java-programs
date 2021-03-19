// import javax.print.event.PrintJobListener;

// import org.graalvm.compiler.core.common.cfg.PrintableDominatorOptimizationProblem;
 public class JavaTutorial
{
	public static void main (String args []){

		int marks = 122;
		if(marks<50){
	        System.out.println("fail");

		}else if(marks>=50 && marks<65){
			System.out.println("D grade");

		}else if(marks>=65 && marks<75){
			System.out.println("c grade");             

		}else if(marks>=75 && marks<90){
           System.out.println("B grade");

		}else if(marks>=90 && marks<=100){
           System.out.println("A grade");

		}else{
			System.out.println("invalid");
		}
		
	}
	
}