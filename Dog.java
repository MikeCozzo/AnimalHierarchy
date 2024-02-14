package animalHierarchy;

public class Dog implements Animal{
	public String move;
	public String sound;
	public String furcolor;
	
	void setfurcolor(String furcolor){
		this.furcolor = furcolor;
	}
	String getfurcolor() {
		return furcolor;
	}
	@Override
	public void move(String movement) {
		
		this.move = movement;
	}
	
	@Override
	public void makesound(String sound) {
		this.sound = sound;
	}
	@Override
	public String toString() {
		return "Dog [move=" + move + ", sound=" + sound + ", furcolor=" + furcolor + "]";
	}

	

	
	
	
}
