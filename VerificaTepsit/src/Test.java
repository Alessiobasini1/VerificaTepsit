
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListRettangolo alr = new ArrayListRettangolo(null);
		Rettangolo r = new Rettangolo();
		Rettangolo r1 = new Rettangolo(20,45);
		Rettangolo r2 = new Rettangolo(20,35);
		Rettangolo r3 = new Rettangolo(27,45);
		alr.addRettangolo(r1);
		alr.addRettangolo(r2);
		alr.addRettangolo(r3);
		System.out.println(alr.toString());
		alr.Restituzione(35);
		alr.ricercaRettangolo(27);
		System.out.println(alr.toString());
		
		
	}

}
