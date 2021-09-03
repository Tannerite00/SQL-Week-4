package animalDAO;

import java.util.ArrayList;
import java.util.List;

import animal.Animals;

public class AnimalData {

		
	public static List<Animals> animalList = new ArrayList<Animals>(List.of(
		new Animals("Lion"),
		new Animals("Tiger"),
		new Animals("Bear"),
		new Animals("Cheatah"),
		new Animals("Shark")));

	
	public static List<Animals> getAnimals() {
		return animalList;
	}
}
