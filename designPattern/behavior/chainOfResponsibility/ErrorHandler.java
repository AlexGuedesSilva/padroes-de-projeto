package designpattern.behavior.chainofresponsibility;

//ConcreteHandler3
class ErrorHandler extends Handler {
	@Override
	public void handleRequest(String request) {
		System.out.println("Requisição não reconhecida: " + request);
	}
}