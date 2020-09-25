package Assignment3_ArithmaticOperators;

public class Question_5 {

	public static void main(String[] args) {
		
		
		int inputSeconds,hours, minutes,seconds;
		inputSeconds=3695;
		hours=inputSeconds/(60*60);
		minutes=(inputSeconds%3600)/60;
		seconds=(inputSeconds%3600)%60;
		
		System.out.println(hours+ " hours "+ minutes+" minutes "+ seconds+" seconds");
		
		
	}
}
