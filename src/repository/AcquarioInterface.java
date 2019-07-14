package repository;

import model.Vasca;

public interface AcquarioInterface extends iCrud<Vasca> {
	public void removeEsemplareByNominativo(int vascaId, String writtenScelta);
}
