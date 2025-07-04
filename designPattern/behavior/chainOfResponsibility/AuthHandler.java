package designPattern.behavior.chainOfResponsibility;

// ConcreteHandler1
class AuthHandler extends Handler {
	@Override
	public void handleRequest(String request) {
		if (request.equals("auth")) {
			System.out.println("Autenticação realizada.");
		} else if (next != null) {
			next.handleRequest(request);
		}
	}
}
