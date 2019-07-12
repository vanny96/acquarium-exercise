package repository;

import java.util.ArrayList;
import java.util.List;

import model.Esemplare;
import model.Vasca;

public class VascheArrayListImpl implements AcquarioInterface {
	private List<Vasca> vasche;

	public VascheArrayListImpl() {
		vasche = new ArrayList<Vasca>();
	}

	@Override
	public List<Vasca> getAll() {
		// TODO Auto-generated method stub
		return vasche;
	}

	@Override
	public Vasca getById(int id) {
		// TODO Auto-generated method stub
		return vasche.get(id);
	}

	@Override
	public void add(Vasca element) {
		vasche.add(element);
	}

	@Override
	public void removeById(int id) {
		vasche.remove(id);
	}

	@Override
	public void setEsemplariToVasca(int pos, List<Esemplare> esemplari) {
		vasche.get(pos).setEsemplari(esemplari);
	}

	public void removeEsemplareByNominativo(int vascaId, String writtenScelta) {
		int i=-1;
		for(Esemplare esemplare : vasche.get(vascaId).getEsemplari()){
			if(esemplare.getIdentificativo().equals(writtenScelta)){
				i = vasche.get(vascaId).getEsemplari().indexOf(esemplare);
			}
		}

		if(i!=-1){
			vasche.get(vascaId).getEsemplari().remove(i);
		}
	}

}
