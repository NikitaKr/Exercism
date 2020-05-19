
class Acronym {

    String acronym = "";
  
    
    Acronym(String phrase) {
        for (int i = 0; i < phrase.length(); i++) {
            if (i == 0) {
                if(Character.isUpperCase(phrase.charAt(i))) {
                    acronym = acronym.concat(String.valueOf(phrase.charAt(i)));
            } }
            if (i > 0) {
                if (Character.isWhitespace(phrase.charAt(i-1)) || phrase.charAt(i-1) == '-' || phrase.charAt(i-1) == '_') {
                    if(phrase.charAt(i) != ' ' && phrase.charAt(i) != '-' && phrase.charAt(i) != '_') {
                    acronym = acronym.concat(String.valueOf(phrase.charAt(i))); }
                }
            }
        
            }

        acronym = acronym.toUpperCase();
        }
    

    String get() {
       return acronym;
    }

}
