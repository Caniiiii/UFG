package candidatos;

public class Start {
	
	public static void main(String[] args) {
		Dilma dilma = new Dilma();
		Aecio aecio = new Aecio();
		Fidelis fidelis = new Fidelis();
		Marina marina = new Marina();
		
		dilma.setDilma();
		dilma.setDilma();
		dilma.setDilma();
		
		aecio.setAecio();
		aecio.setAecio();
		
		System.out.println(dilma.getDilma());
		System.out.println(aecio.getAecio());
		System.out.println(fidelis.getFidelis());
		System.out.println(marina.getMarina());
	}
}
