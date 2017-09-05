package junit;

public class MessageUtil {
	
	private String message;

	public MessageUtil(String message) {
		super();
		this.message = message;
	}
	
	public String printMessage()
	{
		System.out.println(message);
		return message;
	}
	
	public String salutationMessage()
	{
		return "Hi!" + message;
	}
}
