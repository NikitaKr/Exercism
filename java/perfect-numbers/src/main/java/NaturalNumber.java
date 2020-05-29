import java.util.ArrayList;

class NaturalNumber {

    int sum = 0;
    int num = 0;

    public NaturalNumber(int number) {

        num = number;

        if(num == 0 || num < 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < number + 1 ; i++) {
            if(number % i == 0) {
                if(i == number) {
                    break;
                } else {
                    list.add(i);
                }
            }
        }
        for (int i: list) {
            sum += i;
        }

    }

    public Classification getClassification() {

        Classification classification = null;

        if(num == sum) {
            classification = Classification.PERFECT;
        }
        if (num < sum) {
            classification = Classification.ABUNDANT;
        }
        if(num>sum || num == 1) {
            classification = Classification.DEFICIENT;
        }

        return classification;

    }
}
