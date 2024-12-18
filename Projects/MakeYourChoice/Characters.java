
public class Characters {
	 private String name;
	    private int age;
	    private int hp;

	    // Constructor with renamed parameters to avoid conflict
	    public Characters(String characterName, int characterAge) {
	        name = characterName; // No need for 'this.'
	        age = characterAge; // No need for 'this.'
	        hp = 100; // Default HP
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String characterName) {
	        name = characterName; // No need for 'this.'
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int characterAge) {
	        age = characterAge; // No need for 'this.'
	    }

	    public int getHp() {
	        return hp;
	    }

	    public void setHp(int newHp) {
	        hp = newHp; // No need for 'this.'
	    }

	    public void updateHp(int change) {
	        hp += change; // No need for 'this.'
	        if (hp < 0) hp = 0; // Prevent negative HP
	    }
	}
