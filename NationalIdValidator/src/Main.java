import DC.NationalIdValidator;
import Util.InputValidator;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("Enter Your Choice: 1:National Code || 2:Exit");
                System.out.print("Your Choice: ");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter a National Code: ");
                        String nationalCode = input.next().trim();
                        if (!InputValidator.isNumericCode(nationalCode, 10)) {
                            System.out.println("Just enter numbers and 10 characters");
                        }
                        //System.out.println("Tset : " + NationalIdValidator.isValidNationalId(nationalCode));
                        else if (NationalIdValidator.isValidNationalId(nationalCode)) {
                            System.out.println("National Code is Valid.");
                        }
                        else
                            System.out.println("Invalid National Code!");

                        break;
                    case 2:
                        return;
                    default:
                    System.out.println("Invalid Your Choice. Try again.");
            }
        }
    } catch(
    Exception e)

    {
        System.out.println("Error in Operation!");
    }

}
}