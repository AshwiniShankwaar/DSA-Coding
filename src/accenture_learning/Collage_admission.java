package accenture_learning;

import java.util.Scanner;

public class Collage_admission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int hsc = 0;
        int total_hsc = 0;
        double cutoff = 0.0;
        int sslc = 0;
        int total_sslc = 0;
        char gender ;
        System.out.println("Applicant name");
        name = scanner.nextLine();
        System.out.println("Marks obtains in HSC");
        hsc = scanner.nextInt();
        System.out.println("Total possible marks in HSC");
        total_hsc = scanner.nextInt();
        System.out.println("Engineering cutoff mark");
        cutoff = scanner.nextDouble();
        System.out.println("Marks obtained in SSLC");
        sslc = scanner.nextInt();
        System.out.println("Total possible marks in SSLC");
        total_sslc = scanner.nextInt();
        System.out.println("Gender");
        gender = scanner.next().charAt(0);

        System.out.println("Your Application has been Submitted successfully" +
                "\nThe name of the applicant: "+name+
                "\nEngineering cutoff: "+cutoff+
                "\nApplicant gender: "+gender+"\nAll the best for your Career ");
    }
}
