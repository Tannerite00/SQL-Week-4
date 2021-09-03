package animal;

public class Animals {
	
	public static Object compareAnimals;
	String name;
 
	public Animals(String name) {
	 this.name = name;
 }
 
	public String getName() {
	 return name;
 }
	@Override
	public String toString() {
		return this.getName() + " " + "Animal";
}

	public static int compare(Animals a1, Animals a2) {
		return a1.name.compareTo(a2.name);
		
	}

}

