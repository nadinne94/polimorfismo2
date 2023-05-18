
public class TesteTributavel {
	
	public static void main(String[] args) {
	
		ContaCorrente cc = new ContaCorrente(111, 11111110);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}
}
