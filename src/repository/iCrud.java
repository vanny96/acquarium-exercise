package repository;

import java.util.List;

public interface iCrud<T> {
	public List<T> getAll();
	public T getById(int id);
	public void add(T element);
	public void removeById(int id);
}
