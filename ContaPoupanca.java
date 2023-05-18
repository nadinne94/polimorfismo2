
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public boolean saca(double valor) {
		double valorComJuros = valor + (valor * 0.02);
		return super.saca(valorComJuros);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

}
