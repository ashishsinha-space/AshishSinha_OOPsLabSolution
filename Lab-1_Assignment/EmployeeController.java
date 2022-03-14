package com.greatlearning.controller;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeCredentialService;

public class EmployeeController {
	public static void main(String[] args) {
		Employee emp = new Employee("Avishek","Das");
		EmployeeCredentialService service = new EmployeeCredentialService();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter FirstName : ");
		//				Scanner sc= new Scanner(System.in);
		emp.setFirstName(sc.nextLine());

		System.out.println("Enter laststName");
		//				Scanner sc= new Scanner(System.in);
		emp.setLastName(sc.nextLine());


		System.out.println("\n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		System.out.println("Enter the Department No. : ");
		int choice = sc.nextInt();

		String generatedEmail; 
		char[] generatedPassword;
		
		switch(choice) {
			case 1:
				generatedEmail = service.generateEmailAddress(emp, "technical");
				generatedPassword = service.generatePassword();
				service.showCredentials(emp, generatedEmail, generatedPassword);
				break;
			case 2:
				generatedEmail = service.generateEmailAddress(emp, "admin");
				generatedPassword = service.generatePassword();
				service.showCredentials(emp, generatedEmail, generatedPassword);
				break;
			case 3:
				generatedEmail = service.generateEmailAddress(emp, "humanresource");
				generatedPassword = service.generatePassword();
				service.showCredentials(emp, generatedEmail, generatedPassword);
				break;
			case 4:
				generatedEmail = service.generateEmailAddress(emp, "legal");
				generatedPassword = service.generatePassword();
				service.showCredentials(emp, generatedEmail, generatedPassword);
				break;
			default: System.out.println("\n Invalid Choice.");
				break;
		}
		sc.close();
	}
}
