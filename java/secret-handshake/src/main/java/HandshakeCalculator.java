import java.util.*;



class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        

        List<Signal> list = new ArrayList<>();

        for (Signal signal : Signal.values()) {

            if ((number & signal.getBinary()) != 0) {
                
                if (signal == Signal.REVERSE) {
                    Collections.reverse(list);
                } else {
                    list.add(signal);
                }
            }
        
       
        }
            return list;
    }
    

}
