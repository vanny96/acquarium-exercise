package controller;

import java.util.ArrayList;

import model.Esemplare;
import model.Mammifero;
import model.Pesce;
import model.Vasca;
import repository.EsemplariArrayListImpl;
import repository.VascheArrayListImpl;
import view.Vista;

public class AcquarioManager {

	public static void main(String[] args) {
		Vista v = new Vista();
		VascheArrayListImpl vasche = new VascheArrayListImpl();
		
		EsemplariArrayListImpl tempEseplari = new EsemplariArrayListImpl();

		Esemplare newEsemplare = null;

		int scelta = -1;
		int miniScelta = -1;
		String writtenScelta = "";
		boolean flag = false;
		
		int vascaId=0;
		
		vasche.add(new Vasca(v.leggiString("Inserisci nome della prima vasca: ")));
		vasche.add(new Vasca(v.leggiString("Inserisci nome della seconda vasca: ")));

		do{
			v.stampaMenuOperazioni();
			scelta = v.leggiInt("Che operazione eseguire: ");

			switch(scelta){
			// Inserimento di esemplari nella vasca
			case 1:
				
				//Scelta dell'acquario
				do{
					flag=false;
					v.stampaSceltaAcquario(vasche.getAll());

					miniScelta=v.leggiInt("In che acquario operare: ");

					if(miniScelta!=1 && miniScelta != 2){
						v.stampaMessaggio("Scelta non valida\n");
						flag=true;
					}
				}while(flag);
				vascaId = miniScelta -1;
				
				do{
				//Scelta dell'esemplare
				do{
					v.stampaSceltaEsemplare();
					
					miniScelta=v.leggiInt("Che in che acquario inserire: ");

					if(miniScelta!=1 && miniScelta != 2){
						v.stampaMessaggio("Scelta non valida\n");
						flag=true;
					}
					
				}while(miniScelta!=1 && miniScelta != 2);
				
				switch(miniScelta){
				case 1: 
					newEsemplare = new Pesce();
					break;
				case 2:
					newEsemplare = new Mammifero();
					break;
				}
				
				v.mascheraInserimentoEsemplare(newEsemplare);

				
				
				//Aggiungo al tempEsemplari
				tempEseplari.add(newEsemplare);
				
				writtenScelta = v.leggiString("Aggiungere altri esemplari alla vasca? (y per continuare) ");
				}while(writtenScelta.equalsIgnoreCase("y"));
				
				// Aggiungo gli esemplari alla vasca corretta
				for(Esemplare esemplare : vasche.getById(vascaId).getEsemplari()){
					tempEseplari.add(esemplare);
				}
				
				vasche.setEsemplariToVasca(vascaId, new ArrayList<>(tempEseplari.getAll()));
			
				tempEseplari.clearList();
				break;
				
			// Stampa delle vasche
			case 2:
				v.stampaVasche(vasche.getAll());
				break;
				
			case 3:
				//Scelta dell'acquario
				do{
					flag=false;
					v.stampaSceltaAcquario(vasche.getAll());

					miniScelta=v.leggiInt("Che vasca stampare: ");

					if(miniScelta!=1 && miniScelta != 2){
						v.stampaMessaggio("Scelta non valida\n");
						flag=true;
					}
				}while(flag);
				vascaId = miniScelta -1;
				
				v.stampaVascia(vasche.getById(vascaId));
				break;
				
			// Rimozione di esemplare dalla vasca
			case 4:
				//Scelta dell'acquario
				do{
					flag=false;
					v.stampaSceltaAcquario(vasche.getAll());

					miniScelta=v.leggiInt("In che acquario operare: ");

					if(miniScelta!=1 && miniScelta != 2){
						v.stampaMessaggio("Scelta non valida\n");
						flag=true;
					}
				}while(flag);
				vascaId = miniScelta -1;

				// Selezione dell'esemplare da eliminare
				if(!vasche.getById(vascaId).getEsemplari().isEmpty()){
				v.stampaEsemplari(vasche.getById(vascaId).getEsemplari());
				
				writtenScelta=v.leggiString("Inserire il nominativo dell'esemplare da eliminare: ");
				
				//Rimozione dell'esemplare
				vasche.removeEsemplareByNominativo(vascaId, writtenScelta);
				} else {
					v.stampaMessaggio("La vasca è vuota.");
				}
				
				break;
				
			case -1:
				break;
			default: 
				v.stampaMessaggio("Scelta non valida\n");
			}
		}while(scelta!=-1);

	}

}
