package animalHierarchy;

public class Fish implements Animal{
	
	public String move;
	public String sound;
	public String color;
	
	public void setcolor(String color) {
		this.color = color;
	}
	public String getcolor() {
		return color;
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
		return "Fish [move=" + move + ", sound=" + sound + ", color=" + color + "]";
	}
	
	
}
