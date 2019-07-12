package model;

import java.util.ArrayList;
import java.util.List;

public class Vasca {

	private String name;
	private List<Esemplare> esemplari;

	public Vasca(String name) {
		super();
		this.name = name;
		esemplari = new ArrayList<Esemplare>();
	}
	
	public Vasca() {
		esemplari = new ArrayList<Esemplare>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Esemplare> getEsemplari() {
		return esemplari;
	}

	public void setEsemplari(List<Esemplare> esemplari) {
		this.esemplari = esemplari;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((esemplari == null) ? 0 : esemplari.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vasca other = (Vasca) obj;
		if (esemplari == null) {
			if (other.esemplari != null)
				return false;
		} else if (!esemplari.equals(other.esemplari))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String messaggio = "";
		
		messaggio+="\nVasca "+name+": \n";
				
		for(Esemplare esemplare : esemplari){
			messaggio+="\n"+ esemplare.toString();
		}
		
		return messaggio;
	}
	
	

}
