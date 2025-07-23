package designpattern.structure.proxy;

public class Client {
	public static void main(String[] args) {
		Subject proxy = new ProxySubject();
		proxy.executar();
	}
}
