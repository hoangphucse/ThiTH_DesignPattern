package tranhoangphuc.concretecomponent;

import tranhoangphuc.component.Game;

public class DuaXe extends Game  {
	
	public DuaXe(String ten) {
		tenGame = ten;
		theLoai = "Đua xe";
	}

	@Override
	public String toString() {
		return "DuaXe tenGame=" + tenGame + ", theLoai=" + theLoai + ", phuKien=" + phuKien + "";
	}


	
	
	
	
	
	
	
	
	
}
