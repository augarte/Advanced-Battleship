 package proiektua.advancedBattleship;

public class AdvancedBattleship {

	private static AdvancedBattleship nAdvancedBattleship = null;
	private int txanda = 0;
	private boolean bukatu = false;
	
	private AdvancedBattleship(){
		Teklatua.getTeklatua().hasierakoMezua();
	}
	
	public static AdvancedBattleship getAdvancedBattleship(){
		if(nAdvancedBattleship==null){
			nAdvancedBattleship = new AdvancedBattleship();
		}
		return nAdvancedBattleship;
	}
	
	private void jokalariakSortu(){
		int jokalariKopurua = JokalariZerrenda.getJokalariZerrenda().luzera();
		String[] izenak = Teklatua.getTeklatua().jokalariIzenak(jokalariKopurua);
		for(int x=0; x<jokalariKopurua; x++){
			Jokalaria j = new Jokalaria(izenak[x]);
			JokalariZerrenda.getJokalariZerrenda().jokalariaGehitu(j, x);
		}
	}
	
	public void jokatu(){
		jokalariakSortu();
		hasierakoErasoaKokatu();
		while(!bukatu){
			JokalariZerrenda.getJokalariZerrenda().jokatu(txanda);
		}
	}
	
	private void hasierakoErasoaKokatu(){
		int fragata;
		int akorazatua;
		int hegazGarraio;
		
		for(int x=0; x<JokalariZerrenda.getJokalariZerrenda().luzera(); x++){
			fragata = 4;
			akorazatua = 3;
			hegazGarraio = 1;
			System.out.println(JokalariZerrenda.getJokalariZerrenda().getJokalariarenIzena(x)+", itsasontziak kokatu:");
			System.out.println();
			while (fragata>0){
				System.out.println("Kokatu fragata (x,y) koordentuan:");
				JokalariZerrenda.getJokalariZerrenda().erasoaGehitu(x, new Fragata());
				fragata--;
			}
			while (akorazatua>0){
				System.out.println("Kokatu akorazatua (x,y) koordentuan:");
				JokalariZerrenda.getJokalariZerrenda().erasoaGehitu(x, new Korazatua());
				akorazatua--;
			}
			while (hegazGarraio>0){
				System.out.println("Kokatu hegazkin garraiolaria (x,y) koordentuan:");
				JokalariZerrenda.getJokalariZerrenda().erasoaGehitu(x, new HegazkinGarraiolariak());
				hegazGarraio--;
			}
		}
	}
	
	public void partidaBukatu(){
		System.out.println("Zihur zaude partida bukatu nahi duzula?");
		if(Teklatua.getTeklatua().baiEdoEz()){
			bukatu = true;
		}
	}

	public boolean erasoaEgin(int x, int y){ //True ura jotzen ez badu
		int erasoJok;
		if(txanda==JokalariZerrenda.getJokalariZerrenda().luzera()){ 
			erasoJok=0;}
		else{
			erasoJok=txanda+1;
		}
		return JokalariZerrenda.getJokalariZerrenda().erasoaEgin(x, y, erasoJok);
	}
}
