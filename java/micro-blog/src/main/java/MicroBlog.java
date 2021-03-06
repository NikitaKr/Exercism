import java.util.stream.IntStream;

class MicroBlog {

    String truncatedString = "";
    int len = 0;

    public String truncate(String input) {

        len = input.length();

        for (int i = 0; i < len; i++) {
            if (Character.isSurrogatePair(input.charAt(i), input.charAt(i))) {
                if (i <= len) {
                    int charCodePoint = input.codePointAt(i);
                    char emoji[] = {
                            Character.highSurrogate(charCodePoint),
                            Character.lowSurrogate(charCodePoint)
                    };

                    truncatedString += String.valueOf(emoji);
                    len = len + 10;
                }

            } else {
                if (i <= 4) {
                    truncatedString = truncatedString.concat(String.valueOf(input.charAt(i)));
                }


            }
        }

        return truncatedString;
    }
}