
class Acronym {

    String acronym = "";
    
    Acronym(String phrase) {
        
        for (int i = 0; i < phrase.length(); i++) {
            if(Character.isUpperCase(phrase.charAt(i))) {
                acronym = acronym.concat(String.valueOf(phrase.charAt(i)));
            }
        }
    }

    String get() {
       return acronym;
    }

}
