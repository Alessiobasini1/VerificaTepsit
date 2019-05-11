
public class Rettangolo {
	private float base;
	private float altezza;
	
	public Rettangolo(float base, float altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}

	public Rettangolo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rettangolo(Rettangolo r) {
		super();
		this.base =r.base;
		this.altezza =r.altezza;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + "]";
	}
	
	
	
	
}
