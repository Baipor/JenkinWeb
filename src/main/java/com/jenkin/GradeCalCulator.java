package com.jenkin;

public class GradeCalCulator {
	
	public String showGrade(int score){
		
		String grade = "";
		
		if(score <= 39){			
			grade = "F";
		}else if (score <= 49){
			grade = "F+";
		}else if (score <= 54){
			grade = "D-";
		}else if (score <= 59){
			grade = "D";
		}else if (score <= 64){
			grade = "D+";
		}else if (score <= 69){
			grade = "C";
		}else if (score <= 79){
			grade = "B";
		}else if (score <= 84){
			grade = "A-";
		}else if (score <= 94){
			grade = "A";
		}else if (score <= 100){
			grade = "A+";
		}else{
			grade = "error";
		}
		
		return grade;
	}

}
