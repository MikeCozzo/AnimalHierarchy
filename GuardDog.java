package animalHierarchy;

public class GuardDog extends Dog{
	
	
	private short meanness;
	

	public void setMeanness(short meanness) {
		this.meanness = meanness;
	}
	public short getMeanness() {
		return meanness;
		
	}
	@Override
	public String toString() {
		return "GuardDog [meanness=" + meanness + ", move=" + move + ", sound=" + sound + ", furcolor=" + furcolor
				+ "]";
	}
	
	
	
}
