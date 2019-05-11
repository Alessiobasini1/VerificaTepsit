import java.util.ArrayList;

public class ArrayListRettangolo {
	private ArrayList<Rettangolo> list;

	public ArrayListRettangolo(ArrayList list) 
	{
		list = new ArrayList<Rettangolo>(20);
		this.list = list;
	}
	
	public void addRettangolo(Rettangolo r)
	{
		list.add(r);
	}
	
	public boolean Restituzione(float altezza)
	{
		/*for(int i=0; i<list.size();i++)
		{
			if(titolo == this.)
			{
				return true;
			}
		}*/
		for(Rettangolo rettangolo : list)
		{
			if(rettangolo.getAltezza()==altezza)
			{
				list.remove(altezza);
				return false;
			}
		}
		return false;
	}
	
	public String ricercaRettangolo(float base) {
		for(Rettangolo rettangolo : list) {
			if(rettangolo.getBase()==base) {
				return rettangolo.toString();
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "ArrayListRettangolo [list=" + list + "]";
	}
	
	
	
	
}
	

