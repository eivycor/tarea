package tareapoot;

public abstract class Animal extends SerVivo {
	public abstract void alimentarse();
	
		public static void main(String[] args) {
		AnimalCarnivoro anicar=new AnimalCarnivoro();
			anicar.alimentarse();
			
			AnimalHerbivoro animalh=new AnimalHerbivoro();
		animalh.alimentarse();}
		public Animal() {
			
		}}	