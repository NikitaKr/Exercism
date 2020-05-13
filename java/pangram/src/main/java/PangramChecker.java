

public class PangramChecker {

    public boolean isPangram(String input) {

        String val = input.toLowerCase();
        boolean state = false;
        
        String str = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        int len = str.length();
    

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < val.length(); j++) {
               
                if(str.charAt(i) == val.charAt(j)) {
                    result = result.concat(String.valueOf(str.charAt(i)));
                        if(i < len - 1) {
                            i++;
                            j = 0;
                        }  
                }
            }
        
        }

        if (result.contains(str)) {
            state = true;
        }
        return state;
   
    }

}
