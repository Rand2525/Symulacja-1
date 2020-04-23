package KlasaSpoleczna;

import Towar.*;

public class Niewolnicy extends KlasaSpoleczna {
	
	
	public Niewolnicy(int Xniewolnicy, int Yniewolnicy) {
		super(Xniewolnicy, Yniewolnicy);
	}
	
	public void Handel(KlasaSpoleczna klasa) {
		if(klasa.getXpolozenie() >= getXpolozenie()-1 && klasa.getXpolozenie() <= getXpolozenie()+1) 
			if(klasa.getYpolozenie() >= getYpolozenie()-1 && klasa.getYpolozenie() <= getYpolozenie()+1) { 
				System.out.println("Handlujemy");
				
				if(klasa instanceof Rzemieslnicy) {
					while(klasa.getJedzenie() != 0 && getNarzedzia() != 0) {
						klasa.setJedzenie(klasa.getJedzenie()-1);
						setJedzenie(getJedzenie()+1);
						klasa.setNarzedzia(getNarzedzia()+1);
						setNarzedzia(getNarzedzia()-1);
					}
					while(klasa.getUbrania() != 0 && getMaterialy() != 0) {
						klasa.setUbrania(klasa.getUbrania()-1);
						setUbrania(getUbrania()+1);
						klasa.setMaterialy(getMaterialy()+1);
						setMaterialy(getMaterialy()-1);
					}
				}
				if(klasa instanceof Arystokracja) {
					while(klasa.getJedzenie() != 0 && getZloto() != 0 ) {
						klasa.setJedzenie(klasa.getJedzenie()-1);
						setJedzenie(getJedzenie()+1);
						klasa.setZloto(getZloto()+1);
						setZloto(getZloto()-1);
					}
					while(klasa.getUbrania() != 0 && getTowary() != 0) {
						klasa.setUbrania(klasa.getUbrania()-1);
						setUbrania(getUbrania()+1);
						klasa.setTowary(getTowary()+1);
						setTowary(getTowary()-1);
					}
				}
					
			}
	}
	
	
	public void ZbieranieTowarow(Towar towar) {
		setJedzenie(towar.getJedzenie());
		setUbrania(towar.getUbrania());
		setNarzedzia(towar.getJedzenie());
		setMaterialy(towar.getMaterialy());
		setTowary(towar.getTowary());
		setZloto(towar.getZloto());
	}
}