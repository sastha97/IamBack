
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		// ref_nam=new class_name

		p = new Person();
		//p.setValues();
		p.display();

		p = new Person(22, "PVR");
		//p.setValues(20, "KSR");

		p.display();
		p.setAge(1000);
		p.display();

	}

}