package aufgabe3;

public class Fahrzeug {
	
	private String name;
	private float zuladungsGewicht, kilometerPreis;

	public Fahrzeug(){
		
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getZuladungsGewicht() {
		return zuladungsGewicht;
	}
	public void setZuladungsGewicht(float zuladungsGewicht) {
		this.zuladungsGewicht = zuladungsGewicht;
	}
	public float getKilometerPreis() {
		return kilometerPreis;
	}
	public void setKilometerPreis(float kilometerPreis) {
		this.kilometerPreis = kilometerPreis;
	}
}
