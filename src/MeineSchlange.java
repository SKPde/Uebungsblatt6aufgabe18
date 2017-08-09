
public class MeineSchlange implements WarteSchlange{
	
		Wert anfang = null;
		Wert ende = null;

	@Override
	public void rein(Wert d) {
		// TODO Auto-generated method stub
		if(anfang == null) {
			anfang = d;
			ende = d;
		} else {
			ende.next = d;
			ende = d;
		}
		
	}

	@Override
	public Wert raus() {
		// TODO Auto-generated method stub
		return null;
	}

}
