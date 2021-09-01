package entity;

public class Atm{
	
	private int n100, n50, n20, n10;
	


	public String retornarQuantidadeDeNotas(float valorDoSaque) {
		
		while(valorDoSaque >= 100) {
			n100+=1;
			valorDoSaque-=100;
		}
		while(valorDoSaque<100 && valorDoSaque>=50) {
			n50+=1;
			valorDoSaque-=50;
		}
		while(valorDoSaque<50 && valorDoSaque>=20) {
			n20+=1;
			valorDoSaque-=20;
		}
		while(valorDoSaque<20 && valorDoSaque>=10) {
			n10+=1;
			valorDoSaque-=10;
		}
		
		if (valorDoSaque==0) {
			
		return devolverResposta();
			
		}else
			return "Não foi possível sacar!";
	}


	public String devolverResposta() {
		if(n100>0) {	
			return "Entregar "+n100+" nota de R$100,00 "
					+n50+" nota de R$50,00 "
					+n20+" nota de R$20,00 e "
					+n10+" nota de R$10,00";
			
		}else if(n100==0) {
			
			return "Entregar "+n50+" nota de R$50,00 "
					+n20+" nota de R$20,00 e "
					+n10+" nota de R$10,00";
			
		}else if(n100==0 && n50==0) {
			
			return "Entregar "+n20+" nota de R$20,00 e "
					+n10+" nota de R$10,00";
			
		}else
			return "Entregar "+n10+" nota de R$10,00";

	}



}
