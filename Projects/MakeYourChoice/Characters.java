public class Characters {

	    String name;
	    int hp;

	     public Characters(String characterName) 
	     {
	        name = characterName;
	        hp = 100; 
	    }


	   
	    public String getName() {
	        return name;
	    }

	    public void setName(String characterName) {
	        name = characterName; 
	    }

	   
	    public int getHp() {
	        return hp;
	    }

	    public void setHp(int newHp) {
	        hp = newHp; 
	    }

	    public void updateHp(int change) {
	        hp += change; 
	       
	    }
	}
