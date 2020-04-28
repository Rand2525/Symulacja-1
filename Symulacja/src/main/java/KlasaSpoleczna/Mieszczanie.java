package KlasaSpoleczna;

import RandomoweLiczby.*;

public class Mieszczanie extends Niewolnicy {
	
	//Konstruktor Mieszczanie tworzacy obiekt z wieksza liczba populacji
	// o 0.05 i dwoma ruchami
	public Mieszczanie(KlasaSpoleczna niewolnik) {
		//Przes�anie do konstruktora rodzica
		super(niewolnik.getXpolozenie(),niewolnik.getYpolozenie());
		setJedzenie(niewolnik.getJedzenie());
		setMaterialy(niewolnik.getMaterialy());
		setNarzedzia(niewolnik.getNarzedzia());
		setTowary(niewolnik.getTowary());
		setUbrania(niewolnik.getUbrania());
		setZloto(niewolnik.getZloto());
		//Dodatkowa Populacja
		setPopulacja((int) (niewolnik.getPopulacja()*1.05));
	}
	
	@Override
	public String toString() {
		return "Mieszczanie";
	}
	
	//Podwojny ruch Mieszcznina
	@Override
	public void Ruch() {
		//Pierwszy ruch
		setXpolozenie(GeneratorRandom.RandomOd0(2)-1);//zmienic aby sprawdzalo w zakresie planszy
		setYpolozenie(GeneratorRandom.RandomOd0(2)-1);
		//Drugi ruch
		setXpolozenie(GeneratorRandom.RandomOd0(2)-1);
		setYpolozenie(GeneratorRandom.RandomOd0(2)-1);
	}
}
