
public class Demo1DObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person [] persons;
		persons = new Person[5];
		persons[0] = new Person();
		persons[1] = new Person(450,"Tutle Chap");
		persons[2] = new Person(140000000,"Earth");
		persons[3] = new Person(0,"dino");
		persons[4] = new Person(100,"centurian");
		
		persons[2].display();
		
		for(Person x: persons) {
			x.display();
		}
	}

}
