package com.technoelevate.aptitude;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		
	
	
	String q1="Which of the following option leads to the portability and security of Java?\n" +
	"(a)Bytecode is executed by JVM\n(b)The applet makes the Java code secure and portable\n(c)Use of exception handling";
	String q2="Which of the following is not a Java features?\n"+
	"(a)Dynamic\n(b)Architecture Neutral\n(c)Use of pointers";
	String q3="The \\u0021 article referred to as a\n"+
			"(a)Unicode escape sequence\n(b)Octal escape\n(c)Hexadecimal";
	String q4="_____ is used to find and fix bugs in the Java programs\n"+
			"(a)JRE\n(b)JDK\n(c)JDB";
	String q5="Which of the following is a valid declaration of a char?\n"+
			"(a)char ch = '\\utea';\n(b)char ca = 'tea';\r\n"
			+ "\n(c)char cr = \\u0223";
	String q6="What is the return type of the hashCode() method in the Object class?\n"+
			"(a)Object\n(b)int\n"
			+ "\n(c)long";
	String q7="Which of the following is a valid long literal?\n"+
			"(a)ABH8097\n(b)L990023\n"
			+ "\n(c)0xnf029L";
	String q8="What does the expression float a = 35 / 0 return?\n"+
			"(a)0\n(b)Not a Number \n(c)Infinity";
	String q9="Which of the following creates a List of 3 visible items and multiple selections abled?\n"+
			"(a)new List(false, 3)\n(b)new List(3, true)\n(c)new List(true, 3)";
	String q10="Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?\n"+
			"(a)javap tool\n(b)javaw command\n(c)Javadoc tool";
	
	
	
	
	Questions[] questions= {
			new Questions(q1,"a"),
			new Questions(q2,"c"),
			new Questions(q3,"a"),
			new Questions(q4,"c"),
			new Questions(q5,"a"),
			new Questions(q6,"b"),
			new Questions(q7,"c"),
			new Questions(q8,"c"),
			new Questions(q9,"b"),
			new Questions(q10,"c"),
			
	};
	check(questions);
}
	
	public static void check(Questions[] questions) {
		
		int score=0;
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<questions.length;i++) {
			
			System.out.println(questions[i].ques);
			String answer=sc.nextLine();
			
			if(answer.equals(questions[i].answer)) {
				
				score++;
				
				
				
			}
			
			
		}
		System.out.println("Total Correct Answer out of 10 = "+score);
		System.out.println("Correct Percentage = "+ (double)(score*100)/10);
		
		if(score<5) {
			System.out.println("Score is bad");
			
		}
		else if(score>=5 && score<=7) {
			System.out.println("Avergae Score");
			
		}
		else {
			System.out.println("Good Score");
		}
		
		
	}
}
	


	
