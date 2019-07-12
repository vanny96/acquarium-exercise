package view;

import java.util.List;
import java.util.Scanner;

import model.Esemplare;
import model.Mammifero;
import model.Pesce;
import model.Vasca;

public class Vista {
	private Scanner reader;
	
	// Logica generale
	public Vista(){
		reader = new Scanner(System.in);
	}

	public String leggiString(String messaggio){
		System.out.print(messaggio);
		return reader.nextLine();
	}

	public int leggiInt(String messaggio){
		boolean flag = true;
		do{
			try{
				flag = false;
				System.out.print(messaggio);
				return Integer.parseInt(reader.nextLine());
			} catch (Exception e) {
				System.out.println("Inserire valore valido.");
				flag = true;
			}
		} while(flag);

		return -1;
	}

	public double leggiDouble(String messaggio){
		boolean flag = true;
		do{
			try{
				flag = false;
				System.out.print(messaggio);
				return Double.parseDouble(reader.nextLine());
			} catch (Exception e) {
				System.out.println("Inserire valore valido.");
				flag = true;
			}
		} while(flag);

		return -1;
	}

	public void stampaMessaggio(String messaggio){
		System.out.println(messaggio);
	}
	
	// Menu operazioni
	
	public void stampaMenuOperazioni(){
		System.out.println("************BENVENUTO NELL' 'ACQUARIO'*********");
		System.out.println("Ecco le operazioni che puoi eseguire: ");
		System.out.println("1) Aggiungi esemplare a vasca");
		System.out.println("2) Visualizza le vasce");
		System.out.println("3) Visualizza la vascia");
		System.out.println("4) Rimuovi esemplare");
		System.out.println("-1) Per uscire");
	}

	public void stampaSceltaAcquario(List<Vasca> vasche) {
		int i = 1;
		for(Vasca vasca : vasche){
			System.out.println(i + ") "+ vasca.getName());
			i++;
		}
	}

	public void stampaSceltaEsemplare() {
		System.out.println("Quale esemplare inserire: ");
		System.out.println("1) Pesce");
		System.out.println("2) Mammifero");
	}

	public void mascheraInserimentoEsemplare(Esemplare newEsemplare) {
		newEsemplare.setIdentificativo(leggiString("Identificativo alfanumerico: "));
		newEsemplare.setEta(leggiInt("Età: "));
		
		if(newEsemplare instanceof Mammifero){
			Mammifero m = (Mammifero) newEsemplare;
			m.setPeriodoGestazione(leggiInt("Periodo gestazione: "));
		} else if(newEsemplare instanceof Pesce){
			Pesce p = (Pesce) newEsemplare;
			p.setProfondita(leggiInt("Profondità: "));
		}
	}

	public void stampaVasche(List<Vasca> vasche) {
		for(Vasca vasca : vasche){
			System.out.println(vasca);
		}
	}

	public void stampaEsemplari(List<Esemplare> esemplari) {
		for(Esemplare esemplare : esemplari){
			System.out.println("\n"+esemplare+"\n");
		}
	}

	public void stampaVascia(Vasca vasca) {
		System.out.println(vasca);
	}
}
