package com.password;

import java.util.Random;
import java.util.Scanner;
public class PasswordGenerator {
	
	public static void main(String[] args) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()-_=+<>?";

        String allChars = upperCase + lowerCase + digits + specialChars;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        System.out.println("Generated Password: " + password);
    } 	

}
