package command;

public class TransformCommand implements Command{

	Game game;
	
	public TransformCommand(Game gg) {
		this.game =gg ;
		
	}

	@Override
	public void excute() {
		game.transform();
	}

}
