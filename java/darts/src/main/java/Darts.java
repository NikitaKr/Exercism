class Darts {

    double distance;

    Darts(double x, double y) {
        distance = Math.sqrt((x*x) + (y*y));       
    }

    int score() {

        int score = 0;
        if (distance > 10.0d) {
            score = 0;
        } else if (distance <= 10.0d && distance > 5.0d) {
            score = 1;
        } else if (distance <= 5.0d && distance > 1.0d) {
            score = 5;
        } else if (distance <= 1.0d && distance >= 0) {
            score = 10;
        }

        return score;

    }
}