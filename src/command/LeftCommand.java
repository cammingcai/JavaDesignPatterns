package command;

public class LeftCommand implements Command{

	Game game;
	
	public LeftCommand(Game gg) {
		this.game =gg ;
		
	}

	@Override
	public void excute() {
		game.toLeft();
	}

}
