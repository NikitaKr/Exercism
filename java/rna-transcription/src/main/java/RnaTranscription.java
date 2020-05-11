class RnaTranscription {

    String transcribe(String dnaStrand) {

        char[] arr1 = dnaStrand.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] ==  'G') {
                arr1[i] = 'C';
            } else if (arr1[i] == 'C') {
                arr1[i] = 'G';
            } else if (arr1[i] == 'A') {
                arr1[i] = 'U';
            } else if (arr1[i] ==  'T') {
                arr1[i] = 'A';
            }
        }

        return new String(arr1);
    }
}
