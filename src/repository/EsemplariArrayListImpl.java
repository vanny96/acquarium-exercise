package repository;

import java.util.ArrayList;
import java.util.List;

import model.Esemplare;

public class EsemplariArrayListImpl implements EsemplariInterface {
	private List<Esemplare> esemplari;

	public EsemplariArrayListImpl() {
		esemplari = new ArrayList<Esemplare>();
	}

	@Override
	public List<Esemplare> getAll() {
		return esemplari;
	}

	@Override
	public Esemplare getById(int id) {
		return esemplari.get(id);
	}

	@Override
	public void add(Esemplare element) {
		esemplari.add(element);
	}

	@Override
	public void removeById(int id) {
		esemplari.remove(id);
	}

	@Override
	public void clearList() {
		esemplari.clear();
	}

}
