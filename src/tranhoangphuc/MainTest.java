package tranhoangphuc;

import tranhoangphuc.component.Game;
import tranhoangphuc.concreatedecorator.TayCam;
import tranhoangphuc.concreatedecorator.VoLang;
import tranhoangphuc.concretecomponent.DuaXe;

public class MainTest {
	public static void main(String[] args) {
		Game game = new DuaXe("Dua xe f1");
		game = new TayCam(game);
		
		
		System.out.println("game1: " + game);
		
		game = new VoLang(game);
		System.out.println("game2: " + game);
	}
}
