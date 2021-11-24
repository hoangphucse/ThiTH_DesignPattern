package tranhoangphuc.concretecomponent;

import tranhoangphuc.component.Game;

public class BanSung extends Game {

	
	public BanSung(String ten) {
		tenGame = ten;
		theLoai = "Hành động";
	
		
		
	}

	@Override
	public String toString() {
		return "BanSung tenGame=" + tenGame + ", theLoai=" + theLoai + ", phuKien=" + phuKien + "";
	}


	
	
	
	
	
}
