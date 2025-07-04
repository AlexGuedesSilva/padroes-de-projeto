package designPattern.behavior.chainOfResponsibility;

//Client
public class Main {
	public static void main(String[] args) {
		Handler auth = new AuthHandler();
		Handler log = new LoggingHandler();
		Handler error = new ErrorHandler();

		auth.setNext(log);
		log.setNext(error);

		auth.handleRequest("auth");
		auth.handleRequest("log");
		auth.handleRequest("outro");
	}
}