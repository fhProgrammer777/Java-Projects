package DC;

public class NationalIdValidator {
    public static boolean isValidNationalId(String nationalId)
    {
        if (nationalId.chars().distinct().count() == 1)
            return false;
        int sum = 0;
        for (int i = 0; i < nationalId.length() - 1; i++) {
            int num = Character.getNumericValue(nationalId.charAt(i));
            sum +=  num * (10 - i);
        }
        //System.out.println(sum);
        int remainder = (sum % 11) ;
        int controlDigit = Character.getNumericValue(nationalId.charAt(9));
        if (remainder < 2)
        {
            return controlDigit == remainder;
        }
        else
            return controlDigit == 11-remainder;
    }
}

