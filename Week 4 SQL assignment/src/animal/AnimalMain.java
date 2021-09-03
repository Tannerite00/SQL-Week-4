package animal;

import java.util.List;

public class AnimalMain {

		public static void main(String [] args) {
			List<Animals> sortedAnimalList = AnimalSort.sortAnimals();
			System.out.println(sortedAnimalList);
		}
}
