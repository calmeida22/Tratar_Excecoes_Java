
public class TestaSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123,321);
		
		conta.deposita(200);
		
		try {
		conta.saca(50);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Excessão "+ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("Saldo final: "+conta.getSaldo());
		
	}

}
