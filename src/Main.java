import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        String firstName = "Zsolt";
        String lastName = "Molnar";
        char myGender = 'M';
        int myAge = 23;
        double averageGrade = 3.0;
        boolean married = false;
        Date birthDate = new Date(851818210000L);

        System.out.println("Meine name ist.: " + firstName + " " + lastName);
        System.out.println("Meine geschlecht ist.: " + myGender);
        System.out.println("Mein alter.: " + myAge);
        System.out.println("Ich bin geboren.: " + birthDate);
        System.out.println("Mein Notendurchschnitt.: " + averageGrade);
        System.out.println("Ich bin verheiratet.: " + married);


    }

}