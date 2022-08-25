//Write a Java Program to take marks of a student and then print his/her grade depending on the following conditions:90 to 100 then grade is A+, 


package com.java;

public class grade {

		public static void main(String args[])
		{
			int marks[] = { 25, 65, 46, 98, 78, 65 };


			int max_marks = marks.length * 100;

		
			int total = 0;

	
			char grade = 'F';
			for (int i = 0; i < marks.length; i++) {
				total += marks[i];
			}

			double percentage
				= ((double)(total) / max_marks) * 100;
			
			if (percentage >= 90) {
				grade = 'A';
			}
			else {
				if (percentage >= 80 && percentage <= 89) {
					grade = 'B';
				}
				else {
					if (percentage >= 60 && percentage <= 79) {
						grade = 'C';
					}
					else {
						if (percentage >= 33 && percentage <= 59) {
							grade = 'D';
						}
						else {
							grade = 'F';
						}
					}
				}
			}

			System.out.println(grade);
		}
	}



