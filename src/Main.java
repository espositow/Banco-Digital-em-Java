
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Washington");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Hely");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		Conta cc2 = new ContaCorrente(cliente2);
		Conta poupanca2 = new ContaPoupanca(cliente2);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc2.depositar(200);
		poupanca.transferir(50,poupanca2);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
	}

}
