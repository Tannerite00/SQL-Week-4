package animal;
import java.util.List;
import java.util.stream.Collectors;
import animalDAO.AnimalData;


public class Stream {

	public static void main(String [] args) {
		AnimalData animalStream = new AnimalData();
		List<Animals> animalList = animalStream.getAnimals();
		
		String animalString = animalList.stream().map(String::valueOf).sorted().collect(Collectors.joining(", "));
		
		System.out.println(animalString);
	}
}
