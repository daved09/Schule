package aufgabe3;

public class Fahrzeug {
	
	private String name;
	private float zuladungsGewicht, kilometerPreis;

	public Fahrzeug(){
		this("Fahrzeug", 100, 1.00f);
	}

	public Fahrzeug(String name, float zuladungsGewicht, float kilometerPreis){
		setName(name);
		setZuladungsGewicht(zuladungsGewicht);
		setKilometerPreis(kilometerPreis);
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
