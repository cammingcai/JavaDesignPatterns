package command;

public class CammingCommand {

	private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private TransformCommand transformCommand;
    
    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setTransformCommand(TransformCommand transformCommand) {
        this.transformCommand = transformCommand;
    }
    
    public void toLeft(){
        leftCommand.excute();
    }

    public void toRight(){
        rightCommand.excute();
    }
    public void transform(){
        transformCommand.excute();
    }
    
}
