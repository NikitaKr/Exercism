import java.math.BigInteger;
import java.lang.*;

class Grains {

    BigInteger num = new BigInteger("2");

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return num.pow(square - 1);
}

    BigInteger grainsOnBoard() {
        return num.pow(64).subtract(BigInteger.valueOf(1));
    }

}
