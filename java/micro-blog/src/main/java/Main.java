public class Main {

    public static void main(String[] args) {

        String input = "🤧🤒";
        String truncatedString = "";

        for (int i = 0; i < input.length(); i++) {
            if(Character.isSurrogatePair(input.charAt(i), input.charAt(i))) {
                if(i <= 4) {
                    int charCodePoint = input.codePointAt(i);
                    char emoji[] = {

                            Character.highSurrogate(charCodePoint),
                            Character.lowSurrogate(charCodePoint)
                    };

                    truncatedString += String.valueOf(emoji);
                }

            } else {
                if (i <= 4) {
                    truncatedString = truncatedString.concat(String.valueOf(input.charAt(i)));
                }
            }
        }
        System.out.println(truncatedString);

    }
}
