package tranhoangphuc.concreatedecorator;

import tranhoangphuc.component.Game;
import tranhoangphuc.decorator.GameDecorator;

public class TayCam extends GameDecorator {

	public TayCam(Game game) {
		super(game);
		this.phuKien += this.themPhuKien();
	}

	@Override
	public String themPhuKien() {
		return " tay cầm";
	}
	
	
	@Override
	public String toString() {
		return game + " " + phuKien;
	}
	



}
