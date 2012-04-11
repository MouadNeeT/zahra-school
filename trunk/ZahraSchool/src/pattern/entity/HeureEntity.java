/**
 * author GAUTIER Stéphanie
 */

package pattern.entity;

import pattern.beans.Jour;

public class HeureEntity {
private Jour jour;
	
	public HeureEntity(){}
	
	public HeureEntity(Jour jour){
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
