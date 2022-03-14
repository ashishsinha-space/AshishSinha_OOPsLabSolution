package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeCredentialService {
	
	String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lowerLetters="abcdefghijklmnopqrstuvwxyz";
	String num="0123456789";
	String specialCharacters="!@#$%^&*+-/,?<>)";
	String values = capitalLetters + lowerLetters + num + specialCharacters;
	
	public char[] generatePassword() {
		char[] generatedPassword = new char[8];
		Random gen = new Random();
		int i;
		for (i=0; i<8; i++) {
			generatedPassword[i] = values.charAt(gen.nextInt(values.length()));
		}		
		return generatedPassword;
	}
	
	public String generateEmailAddress(Employee emp, String department) {		
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + department + ".greatlearning.com";
	}	
	
	public void showCredentials(Employee employee, String generatedEmail, char[] generatedPassword) {
		System.out.println("\n Employee : " + employee.getFirstName() + " " + employee.getLastName());
		System.out.println("\n Email : " + generatedEmail);
		System.out.println("\n Generated Password : " + generatedPassword);
	}
}
