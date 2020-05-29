import java.util.*;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        ArrayList<String> proteinListAnswer = new ArrayList<String>();
        ArrayList<String> listOfCodons = new ArrayList<String>();

        for (int i = 0; i < rnaSequence.length() + 1; i = i + 3) {
            if(i == rnaSequence.length()){
                break;
            }
            listOfCodons.add(rnaSequence.substring(i, i + 3));
        }

        HashMap<String, String> codonMap = new HashMap<String, String>();

        codonMap.put("AUG", "Methionine");
        codonMap.put("UUU", "Phenylalanine");
        codonMap.put("UUC", "Phenylalanine");
        codonMap.put("UUA", "Leucine");
        codonMap.put("UUG", "Leucine");
        codonMap.put("UCU", "Serine");
        codonMap.put("UCC", "Serine");
        codonMap.put("UCA", "Serine");
        codonMap.put("UCG", "Serine");
        codonMap.put("UAU", "Tyrosine");
        codonMap.put("UAC", "Tyrosine");
        codonMap.put("UGU", "Cysteine");
        codonMap.put("UGC", "Cysteine");
        codonMap.put("UGG", "Tryptophan");
        codonMap.put("UAA", "STOP");
        codonMap.put("UAG", "STOP");
        codonMap.put("UGA", "STOP");

        for (int i = 0; i < listOfCodons.size(); i++) {

            if (codonMap.containsKey(listOfCodons.get(i))) {
                    if(codonMap.get(listOfCodons.get(i)) == "STOP"){
                        break;
                    }
                    proteinListAnswer.add(codonMap.get(listOfCodons.get(i)));
            }
        }
        return proteinListAnswer;

    }
}
