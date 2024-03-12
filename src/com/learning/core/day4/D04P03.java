package com.learning.core.day4;
 

import java.util.Scanner;

class CatheyBankException extends Exception {
    public CatheyBankException(String message) {
        super(message);
    }
}

class Validator {
    public void validate(Applicant applicant) throws CatheyBankException {
        if (!isValidApplicantName(applicant.getApplicantName())) {
            throw new CatheyBankException("Invalid Applicant Name");
        }
        if (!isValidPost(applicant.getPostApplied())) {
            throw new CatheyBankException("Invalid Post");
        }
        if (!isValidAge(applicant.getApplicantAge())) {
            throw new CatheyBankException("Invalid Age");
        }

        System.out.println("All details are valid.");
    }

    public boolean isValidApplicantName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public boolean isValidPost(String post) {
        String[] validPosts = {"Probationary Officer", "Assistant", "Special Cadre Officer"};
        for (String validPost : validPosts) {
            if (validPost.equalsIgnoreCase(post)) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidAge(int age) {
        return age > 18 && age < 30;
    }
}

class Applicant {
    private String applicantName;
    private String postApplied;
    private int applicantAge;

    public Applicant(String applicantName, String postApplied, int applicantAge) {
        this.applicantName = applicantName;
        this.postApplied = postApplied;
        this.applicantAge = applicantAge;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getPostApplied() {
        return postApplied;
    }

    public int getApplicantAge() {
        return applicantAge;
    }
}

public class D04P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter applicant name:");
        String applicantName = scanner.nextLine();

        System.out.println("Enter post applied (Probationary Officer/Assistant/Special Cadre Officer):");
        String postApplied = scanner.nextLine();

        System.out.println("Enter applicant age:");
        int applicantAge = scanner.nextInt();

        Applicant applicant = new Applicant(applicantName, postApplied, applicantAge);
        validateApplicant(applicant);

        scanner.close();
    }

    public static void validateApplicant(Applicant applicant) {
        Validator validator = new Validator();
        try {
            validator.validate(applicant);
        } catch (CatheyBankException e) {
            System.out.println(e.getMessage());
        }
    }
}
