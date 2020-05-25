class Scrabble {

    private int score = 0;

    Scrabble(String word) {

           word = word.toUpperCase();
          
           String one = "AEIOULNRST";
           String two = "DG";
           String three = "BCMP";
           String four = "FHVWY";
           String five = "K";
           String six = "JX";
           String seven = "QZ";

        for (int i = 0; i < word.length(); i++) {
           if(one.contains(String.valueOf(word.charAt(i)))) {
               score = score + 1;
           } else if(two.contains(String.valueOf(word.charAt(i)))) {
               score = score + 2;
           } else if(three.contains(String.valueOf(word.charAt(i)))) {
            score = score + 3;
           } else if(four.contains(String.valueOf(word.charAt(i)))) {
            score = score + 4;
           } else if(five.contains(String.valueOf(word.charAt(i)))) {
            score = score + 5;
           } else if(six.contains(String.valueOf(word.charAt(i)))) {
            score = score + 8;
           } else if(seven.contains(String.valueOf(word.charAt(i)))) {
            score = score + 10;
           }
        }
    }

    int getScore() {
        return score;
    }

}
