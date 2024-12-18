
public class Characters {
	   private String name;
	    private int age;
	    private int hp;

	    public Characters(String name, int age) {
	        this.name = name;
	        this.age = age;
	        this.hp = 100; // Default HP
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public int getHp() {
	        return hp;
	    }

	    public void setHp(int hp) {
	        this.hp = hp;
	    }

	    public void updateHp(int change) {
	        this.hp += change;
	        if (this.hp < 0) this.hp = 0; // Prevent negative HP
	    }
	}
