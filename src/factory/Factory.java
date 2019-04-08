package factory;
/**工厂模式*/
public interface Factory {

	Sender getSender(SenderEnum senderEnum);

}
