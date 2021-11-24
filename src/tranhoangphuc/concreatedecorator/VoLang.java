package tranhoangphuc.concreatedecorator;

import tranhoangphuc.component.Game;
import tranhoangphuc.decorator.GameDecorator;

public class VoLang extends GameDecorator {
	
	public VoLang(Game game) {
		super(game);
		this.phuKien += this.themPhuKien();
	}



	@Override
	public String themPhuKien() {
		return " Vô lăng";
	}
	
	@Override
	public String toString() {
		return game + " " + phuKien;
	}
	
	
	
	
	
}
