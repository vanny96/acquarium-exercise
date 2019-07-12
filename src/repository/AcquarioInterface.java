package repository;

import java.util.List;

import model.Esemplare;
import model.Vasca;

public interface AcquarioInterface extends iCrud<Vasca> {
	public void setEsemplariToVasca(int pos, List<Esemplare> esemplare);
	public void removeEsemplareByNominativo(int vascaId, String writtenScelta);
}
