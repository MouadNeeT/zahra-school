package pattern.beans;

public class Heure {
	
	private Jour jour;
	
	public Heure(){}
	
	public Heure(Jour jour){
		this.jour = jour;
	}

	/**
	 * @return the jour
	 */
	public Jour getJour() {
		return jour;
	}

	/**
	 * @param jour the jour to set
	 */
	public void setJour(Jour jour) {
		this.jour = jour;
	}
	

}
