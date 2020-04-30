package Zarzadzanie;

import java.io.IOException;

import Niebezpieczenstwo.GenerujNiebezpieczenstwo;
import Towar.Towar;

public class Main {
	
	public static void main() throws IOException {
		ZapisOdczyt zapisodczyt = new ZapisOdczyt();
		zapisodczyt.Odczyt();
		
		Plansza plansza = new Plansza(zapisodczyt.getWielkoscPlanszyX(),zapisodczyt.getWielkoscPlanszyY());
		
		
		Tura tura = new Tura();
		do{
			tura.AktualizacjaPlanszy();
			/*
			for(Towar towar: Plansza.getTowarNaPlanszy()) {
				System.out.println("Towar:");
				System.out.println("X: " + towar.getXtowar());
				System.out.println("Y: " + towar.getYtowar());
			}
			*/
			/*
			for(GenerujNiebezpieczenstwo niebez : Plansza.getNiebezpieczenstwoNaPlanszy()) {
				System.out.println();
				System.out.println("X : " + niebez.getXniebezpieczenstwo());
				System.out.println("Y : " + niebez.getYniebezpieczenstwo());
			}
			*/
			tura.RuchyKlas();
			tura.ZbierzTowaryKlas();
			tura.HandelKlas();
			tura.Zabojstwa();
			tura.BudynkiNaPlanszy();
			tura.AwansSpoleczny();
			tura.AktualizacjaPopulacjiKlas();
			tura.setLicznikTur(Tura.getLicznikTur()+1);
			System.out.println("                                     Tura: " + Tura.getLicznikTur());
		}while(!tura.Wygrana());
		/*
		System.out.println("X:" + Plansza.getWarsztatNaPlanszy().getXBudynek());
		System.out.println("Y:" + Plansza.getWarsztatNaPlanszy().getYBudynek());
		System.out.println("X:" + Plansza.getMennicaNaPlanszy().getXBudynek());
		System.out.println("Y:" + Plansza.getMennicaNaPlanszy().getYBudynek());
		*/
		
		zapisodczyt.Zapis();
		System.out.println("Licznik tur: " + Tura.getLicznikTur());
	}
	
	
	public static void main(String[] args) throws IOException{
		
		main();
	}
	
	
}
