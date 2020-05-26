class RaindropConverter {

    private String phrase = ""; 

    String convert(final int number) {
        if (number % 3 == 0) {
            if (phrase.isEmpty()) {
                phrase = "Pling"; 
            } else {
                phrase += "Pling";
            }
        } 

        if (number % 5 == 0) {
            if (phrase.isEmpty()) {
                phrase = "Plang"; 
            } else {
                phrase += "Plang";
            }
        } 

        if (number % 7 == 0) {
            if (phrase.isEmpty()) {
                phrase = "Plong"; 
            } else {
                phrase += "Plong";
            }
        } 

        if(phrase.isEmpty()) {
            phrase = String.valueOf(number);
        }
        

        return phrase;
    
    }

    
}

