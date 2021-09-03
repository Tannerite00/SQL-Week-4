package animal;

import java.util.NoSuchElementException;
import java.util.Optional;

import animalDAO.AnimalData;

public class AnimalOptional {

	public static void main(String [] args) {
		
	}
	
	public static Animals animalA(Optional<Animals> animal) {
		return animal.orElseThrow(() -> 
		new NoSuchElementException("This animal has escaped and cannot be found :( "));
	}
	
	public static void animalB() {
		Optional<Animals> optionalAnimal = Optional.of(AnimalData.getAnimals());
		
		System.out.println(animalA(optionalAnimal));
		
		try { 
			animalA(Optional.empty());
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
