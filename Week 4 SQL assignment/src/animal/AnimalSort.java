package animal;

import java.util.List;

import animalDAO.AnimalData;

public class AnimalSort {
	static AnimalData animalData = new AnimalData();
	
	public static List<Animals> sortAnimals() {
		
		List<Animals> animalList = AnimalData.getAnimals();
		animalList.sort((a1, a2) -> Animals.compare(a1, a2));
		
		return animalList;
	}
	
	public static List<Animals> methodReference() {
		List<Animals> animalList = AnimalData.getAnimals();
		animalList.sort(Animals::compare);
		
		return animalList;
	}
}
