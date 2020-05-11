class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

       boolean isArmstrongNumber = false;
       
       String num = String.valueOf(numberToCheck);
       int power = num.length();

       char[] digits = num.toCharArray();

       double number = 0;
       double sum = 0;

       for (int i = 0; i < digits.length; i++) {
            number = Math.pow(Integer.parseInt(String.valueOf(digits[i])), power);
            sum = sum + number;
           
       }

       if ((int) sum == numberToCheck) {
           isArmstrongNumber = true;
       }

       return isArmstrongNumber;



    

    }

}
