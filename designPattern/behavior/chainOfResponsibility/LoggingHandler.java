package designpattern.behavior.chainofresponsibility;

//ConcreteHandler2
class LoggingHandler extends Handler {
	@Override
	public void handleRequest(String request) {
		if (request.equals("log")) {
			System.out.println("Log registrado.");
		} else if (next != null) {
			next.handleRequest(request);
		}
	}
}
