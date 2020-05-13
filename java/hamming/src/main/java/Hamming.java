

public class Hamming {

    private int hamming = 0;

    

    public Hamming(String leftStrand, String rightStrand) {

        boolean compare = false;

        if (leftStrand.length() == 0 && rightStrand.length() != 0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (rightStrand.length() == 0 && leftStrand.length() != 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        if (leftStrand.length() == rightStrand.length()) {
            compare = true;
        } else {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        if (compare) {
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                hamming++;
            }
        }
    }

    }

    public int getHammingDistance() {
        return hamming;
    }
}
