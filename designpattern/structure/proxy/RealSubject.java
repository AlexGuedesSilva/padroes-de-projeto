package designpattern.structure.proxy;

public class RealSubject implements Subject {
	@Override
	public void executar() {
		System.out.println("RealSubject: executando a operação...");
	}
}
