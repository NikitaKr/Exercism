import java.lang.*;

class DifferenceOfSquaresCalculator {

    int squareOfSums = 0;
    int sumOfSquares = 0;

    int computeSquareOfSumTo(int input) {
        for (int i = 0; i < input + 1; i++) {
            squareOfSums += i;
        }
        return (squareOfSums*squareOfSums);
    }

    int computeSumOfSquaresTo(int input) {
        for (int i = 0; i < input + 1; i++) {
            sumOfSquares += (i*i);
        }
        return sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
        int diff = computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
        return diff;
    }

}
