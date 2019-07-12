package model;

public abstract class Esemplare {
	private String identificativo;
	private int eta;
	
	public Esemplare() {
		super();
	}
	
	public Esemplare(String identificativo, int eta) {
		super();
		this.identificativo = identificativo;
		this.eta = eta;
	}
	
	public String getIdentificativo() {
		return identificativo;
	}
	
	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}
	
	public int getEta() {
		return eta;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Identificativo: " + identificativo + "\nEtà: " + eta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eta;
		result = prime * result + ((identificativo == null) ? 0 : identificativo.hashCode());
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
		Esemplare other = (Esemplare) obj;
		if (eta != other.eta)
			return false;
		if (identificativo == null) {
			if (other.identificativo != null)
				return false;
		} else if (!identificativo.equals(other.identificativo))
			return false;
		return true;
	}
	
	
	
}
