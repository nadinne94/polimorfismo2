
public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 11111110);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222222220);
		cp.deposita(200);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		cc.transfere(10, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CC: " + cp.getSaldo());
		
		cp.saca(50);
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		
	}

}
