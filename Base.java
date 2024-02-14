package animalHierarchy;
import java.util.Arrays;
public class Base {

	public static void main(String[] args) {
		Animal zoo[];
		zoo = new Animal[5];
		
		Dog d = new Dog();
		d.move = ("walks");
		d.makesound("bark");
		d.setfurcolor("brown");
		zoo[2] = d;
		
		GuardDog gd = new GuardDog();
		gd.setMeanness((short) 2);
		gd.setfurcolor("black");
		gd.move = ("walks");
		gd.makesound("Bark!");
		zoo[1] = gd;
		
		Fish f = new Fish();
		f.setcolor("yellow");
		f.move = ("swims");
		f.makesound("plup plup");
		zoo[3] = f;
		
		ShowDog sd = new ShowDog();
		sd.getbreed();
		sd.setBreed("lab");
		sd.move = ("walks");
		sd.makesound("Bark! Bark!");
		sd.getfurcolor();
		sd.setfurcolor("brown");
		zoo[4] = sd;
		
		Dog d2 = new Dog();
		d2.move = ("limps");
		d2.makesound("Ruff");
		d2.setfurcolor("golden");
		zoo[0] = d2;
		
		Animal[] copy = Arrays.copyOf(zoo, 2);
		
		
		
		
		System.out.println(Arrays.toString(zoo));
		
		System.out.println(Arrays.toString(copy));
	}
	

}
