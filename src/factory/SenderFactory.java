package factory;

public class SenderFactory implements Factory {

	public SenderFactory() {
	

	}
	
	@Override
	public Sender getSender(SenderEnum senderEnum) {
		Sender mSender;
		switch (senderEnum) {
		case SMS:
			mSender = new SmsSender();
			break;
		case QQ:
			mSender = new QQSender();
			break;
		case WECHAT:
			mSender = new WechatSender();
			break;
		case EMAIL:
			mSender = new EmailSender();
			break;
		default:
			throw new RuntimeException("还没有该类型");
			//break;
		}
		return mSender;
	}


}
