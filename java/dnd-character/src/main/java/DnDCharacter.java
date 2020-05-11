

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int charisma;
    private int intelligence;
    private int wisdom;
    private int hitpoints;
    private int constitution;
    private final double randomNum = Math.random();
    
    boolean getStrength = false;
    int[] arr = new int[3];
    int mod = 0;

    public DnDCharacter() {
        this.charisma = ability();
        this.dexterity = ability();
        this.intelligence = ability();
        this.strength = ability();
        this.wisdom = ability();
        this.constitution = ability();
        this.hitpoints = 10 + modifier(this.constitution);
    }

    int ability() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(this.randomNum * (6 - 1) + 1) + 1;
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
  
    final int getStrength() {
       return this.strength;   
    }

    final int getDexterity() {
        return this.dexterity;
    }

    final int getConstitution() {
        return this.constitution;
    }

    final int getIntelligence() {
        return this.intelligence;
    }

    final int getWisdom() {
        return this.wisdom;
    }

    final int getCharisma() {
        return this.charisma;
    }

    final int getHitpoints() {
        return this.hitpoints;
    }


}
