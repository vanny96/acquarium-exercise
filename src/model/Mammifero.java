package model;

public class Mammifero extends Esemplare {
	private int periodoGestazione;

	public Mammifero() {
	}

	public Mammifero(String identificativo, int eta, int etaGestionale) {
		super(identificativo, eta);
		this.periodoGestazione = etaGestionale;
	}

	public int getPeriodoGestazione() {
		return periodoGestazione;
	}

	public void setPeriodoGestazione(int periodoGestazione) {
		this.periodoGestazione = periodoGestazione;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEsemplare: Mammifero\nProfondita: " + periodoGestazione+"\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + periodoGestazione;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mammifero other = (Mammifero) obj;
		if (periodoGestazione != other.periodoGestazione)
			return false;
		return true;
	}
	
	
}
