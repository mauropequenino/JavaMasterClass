package training.challenge_2.challenge_2;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static Subjects subjects = new Subjects();
	
	public static void main(String[] agss) {
		boolean quit = false;
		printActions();
		
		while(!quit) {
			quit = false;;
			System.out.print("\nEnter action: ");
			int action  = sc.nextInt();
			sc.nextLine();
			
			switch(action) {
			case 0:
				System.out.print("Closing ...");
				quit = true;
				break;
			case 1:
				createSubject();
				break;
			case 2:
				removeSubject();
				break;
			case 3:
				addStudentToSubject();
				break;
			case 4:
				removeStudentFromSubject();
				break;
			case 5:
				getAllStudentsFromAllSubjects();
				break;
			case 6:
				printActions();
				break;
			}	
		}	
	}
	
	public static void createSubject() {
		System.out.print("Subject name: ");
		String subjectName = sc.nextLine();
		System.out.print("Teacher id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Teacher first name: ");
		String teacherFirstName = sc.nextLine();
		System.out.print("Teacher last name: ");
		String teacherLastName = sc.nextLine();
		System.out.print("Teacher code: ");
		String teacherCode = sc.nextLine();
		
		if(subjects.addSubject(subjectName, new Teacher(id, teacherFirstName, teacherLastName, teacherCode))){
			System.out.print("Subject was sucessefully added!\n");
		} else {
			System.out.print("Cannot add beacuse subject already exist\n");
		}
	}
	
	public static void removeSubject() {
		System.out.print("Subject name: ");
		String subjectName = sc.nextLine();
		if(subjects.removeSubject(subjectName)) {
			System.out.print("Subject was sucessefully removed!\n");
		} else {
			System.out.print("Cannot found subject\n");
		}
	}
	
	public static void addStudentToSubject() {
		System.out.print("Subject name: ");
		String subjectName = sc.nextLine();
		System.out.print("Student id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Student first name: ");
		String studentFirstName = sc.nextLine();
		System.out.print("Student last name: ");
		String studentLastName = sc.nextLine();
		System.out.print("Student code: ");
		String studentCode = sc.nextLine();
		
		if(subjects.addStudentToSubject(subjectName, new Student(id,studentFirstName, studentLastName, studentCode))) {
			System.out.print("Student was sucessefully added to the subject!\n");
		} else {
			System.out.print("Cannot found subject\n");
		}
	}
	
	public static void removeStudentFromSubject() {
		System.out.print("Subject name: ");
		String subjectName = sc.nextLine();
		System.out.print("Student first name: ");
		String studentFirstName = sc.nextLine();
		
		if(subjects.removeStudentFromSubject(subjectName, studentFirstName)) {
			System.out.print("Student was sucessefully removed from the subject!\n");
		} else {
			System.out.print("Cannot found subject\n");
		}
	}
	
	public static void getAllStudentsFromAllSubjects() {
		System.out.print(subjects.toString());
	}
	
	
	private static void printActions(){
        System.out.println("\nAvailable action\nPress");
        System.out.println("\n\t0 - to close" +
                "\n\t1 - Add subject" +
                "\n\t2 - Remove subject" +
                "\n\t3 - Add student to an existing subject" +
                "\n\t4 - Remove student to an existing subject" +
                "\n\t5 - Show all students from a subject" +
                "\n\t6 - to print a list of available actions");
    }
}
