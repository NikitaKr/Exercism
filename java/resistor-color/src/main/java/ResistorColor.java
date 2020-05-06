class ResistorColor {

    int colorCode(String color) {
        int i;
        for (i = 0; i < colors().length; i++) {
           if (colors()[i].contentEquals(color)) {
               break;
                }
           }
           return i;
    }

    String[] colors() {
       return new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
