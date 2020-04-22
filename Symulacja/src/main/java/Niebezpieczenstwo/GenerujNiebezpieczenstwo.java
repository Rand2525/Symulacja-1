package Niebezpieczenstwo;

public class GenerujNiebezpieczenstwo {
	private int Xniebezpieczenstwo;
	private int Yniebezpieczenstwo;
	private Niebezpieczenstwo Zabojca;
	
	public GenerujNiebezpieczenstwo(int X, int Y) {
		this.Xniebezpieczenstwo = X;
		this.Yniebezpieczenstwo = Y;
		int a = GeneratorRandom.Random(3);
		switch(a) {
		case 1: Zabojca = new Bandyci();
			break;
		case 2: Zabojca = new DzikieZwierzeta();
			break;
		case 3: Zabojca = new Zlodzieje();
			break;
		default:
			break;
		}
	}
	public Niebezpieczenstwo getZabojca() { return Zabojca; }
	
	public void setXniebezpieczenstwo(int xniebezpieczenstwo) { Xniebezpieczenstwo = xniebezpieczenstwo; }
	public int getXniebezpieczenstwo() { return Xniebezpieczenstwo; }
	public void setYniebezpieczenstwo(int yniebezpieczenstwo) { Yniebezpieczenstwo = yniebezpieczenstwo; }
	public int getYniebezpieczenstwo() { return Yniebezpieczenstwo; }
	
	public static void main(String[] args) {
		GenerujNiebezpieczenstwo obj = new GenerujNiebezpieczenstwo(5, 10);
		int PopulacjaKotkow = 10;
		 PopulacjaKotkow = PopulacjaKotkow - obj.getZabojca().ZmniejszIloscPopulacja();
		 System.out.println(PopulacjaKotkow);
	}
}