package service;

import pojo.Employee;

import java.util.Locale;
import java.util.Random;

public class CredentialService {

    Employee employee;

    public CredentialService(Employee employee) {
        super();
        this.employee = employee;
    }

    public char[] generatePassword(int length)
    {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters +numbers;
        Random random = new Random();
        char[] password = new char[length];
        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = lowerCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = lowerCaseLetters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = lowerCaseLetters.charAt(random.nextInt(numbers.length()));

        for(int i = 4; i < length; i++){
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }

    public String generateEmail(){
          String mail = employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+"@" + employee.getDeptName() + ".gl.com";
        return mail;
    }

    public void showCredentials(String dept){
        System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows: ");
        System.out.println("Email -----> " + generateEmail());
        System.out.println("Password ----->" + generatePassword(8));
        }

}
