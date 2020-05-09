class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

       boolean isArmstrongNumber = false;
       
       String num = String.valueOf(numberToCheck);
       int power = num.length();

       char[] digits = num.toCharArray();

       int number = 0;

       for (int i = 0; i < digits.length; i++) {
           number = (int) Math.pow(digits[i], power);
           if(i > 0) {
               number += number;
           }
       }

       if (number == numberToCheck) {
           isArmstrongNumber = true;
       }

       return isArmstrongNumber;



    

    }

}
