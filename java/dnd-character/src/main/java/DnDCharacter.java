

class DnDCharacter {

    private final int strength;
    private final int dexterity;
    private final int charisma;
    private final int intelligence;
    private final int wisdom;
    private final int hitpoints;


    boolean getStrength = false;
    int[] arr = new int[3];

    int mod = 0;

    int ability() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (6 - 1) + 1) + 1;
        }
        for (int num : arr) {
            sum = sum + num;
        }
        return sum;
    }
    
    int modifier(int input) {
        double result = ((double) input - 10.0) / 2.0;
        result = Math.floor(result);
        
        mod = (int) result;
        return (int) result;
    }
  
    int getStrength() {
       return ability();       
    }

    final int getDexterity() {
        return ability();
    }

    final int getConstitution() {
        return ability();
    }

    final int getIntelligence() {
        return ability();
    }

    final int getWisdom() {
        return ability();
    }

    final int getCharisma() {
        return ability();
    }

    final int getHitpoints() {
        return 10 + mod;
    }


}
