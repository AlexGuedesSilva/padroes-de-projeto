package designpattern.structure.proxy;

public class ProxySubject implements Subject {
	private RealSubject realSubject;
	
	// Exemplo de controle de acesso
	private boolean permiteAcesso() {
		System.out.println("ProxySubject: verificando permissões...");
		// Aqui poderia incluir autenticação, caching, logging, etc.
		return true;
	}
	
	@Override
	public void executar() {
		if (permiteAcesso()) {
			if (realSubject == null) {
				realSubject = new RealSubject();
			}
			System.out.println("ProxySubject: realizando pre-processamento.");
			realSubject.executar();
			System.out.println("ProxySubject: realizando pós-processamento.");
		} else {
			System.out.println("ProxySubject: acesso negado.");
		}
	}

}
