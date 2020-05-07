import java.util.HashMap;

class ResistorColorDuo {
    int value(String[] colors) {
           
            String[] resCols = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};     
            int num1 = 0;
            int num2 = 0;

            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < resCols.length; j++) {
                    if (colors[0] == resCols[j]) {
                        num1 = j;
                    }
                    if (colors[1] == resCols[j]) {
                        num2 = j;
                    }
                }
            }
            String one = String.valueOf(num1);
            String two = String.valueOf(num2);
            String result = one.concat(two);


        

            return Integer.parseInt(result);

          
            



            

        
    }
}
