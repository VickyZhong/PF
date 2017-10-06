package programmingfundamental_assignment;

public class GameItem {

	private char showLook;

	public GameItem(char c) {
		showLook = c;
	}

	public GameItem() {

	}

	public char display(char showLook) {
		return showLook;
	}

	public char getShowLook() {
		return showLook;
	}

}
