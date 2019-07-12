package model;

public class Pesce extends Esemplare {
	private double profondita;

	public Pesce() {
		super();
	}

	public Pesce(String identificativo, int eta, double profondita) {
		super(identificativo, eta);
		this.profondita = profondita;
	}

	public double getProfondita() {
		return profondita;
	}

	public void setProfondita(double profondita) {
		this.profondita = profondita;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEsemplare: Pesce\nProfondita: " + profondita+"\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(profondita);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Pesce other = (Pesce) obj;
		if (Double.doubleToLongBits(profondita) != Double.doubleToLongBits(other.profondita))
			return false;
		return true;
	}	
	
	
}
