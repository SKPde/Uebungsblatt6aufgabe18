
public class MeineSchlange implements WarteSchlange {

	Wert anfang = null;
	Wert ende = null;
	Wert ausgabe = null;

	@Override
	public void rein(Wert d) {
		// TODO Auto-generated method stub
		if (anfang == null) {
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
		if(anfang == null) {
			return null;
		}
		ausgabe = anfang;
		anfang = anfang.next;
		
		return ausgabe;
	}

}
