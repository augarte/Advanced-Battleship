package proiektua.advancedBattleship;

import java.util.Random;

public class Korazatua extends ItsasoIbilgailua {
	
	public Korazatua(){
		super(50,2);
	}

	@Override
	protected void informazioaInprimatu() {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
<<<<<<< HEAD
>>>>>>> branch 'master' of https://aimup@github.com/AimUp/Advanced-Battleship.git
=======
		System.out.println("Luzera 3 duen itsaso erasoa izango da \n Fragataren eraso kasila bakarrekoa izango da");

		System.out.println("Luzera 3 duen itsaso erasoa izango da \n Fragataren eraso 3 kasilakoa izango da");

>>>>>>> addc46ac5105b534b0ff60f0d6a00c7a297d0541
		System.out.println("Luzera 3 duen itsaso erasoa izango da \n Fragataren eraso 3 kasilakoa izango da");

	}

	@Override
	protected String getIzena() {
		// TODO Auto-generated method stub
		return "Korazatua";
	}

	@Override
	protected void erasoaEgin(int zut, int err) {
		// TODO Auto-generated method stub
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(zut,err);
		Random rnd= new Random();
		for(int i=0;i<3;i++){
		//Crear excepcion de ataque fuera de tablero
		int z=rnd.nextInt(zut+2 - zut-2 +1)+zut-2;
		int e=rnd.nextInt(err+2 - err-2 +1)+err-2;
		AdvancedBattleship.getAdvancedBattleship().erasoaEgin(z,e);
		}
	}
}