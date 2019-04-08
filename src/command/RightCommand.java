package command;

public class RightCommand implements Command{

	Game game;
	
	public RightCommand(Game gg) {
		this.game =gg ;
		
	}

	@Override
	public void excute() {
		game.toRight();
	}

}
