
public class Valores implements ValoresITF{
	
	int[] meuArray = new int[10];
	
	@Override
	public boolean ins(int v) {
		boolean retorno = false;
		int d = 0;
		for(int i=0; i < 10; i++){
			
			if(meuArray[i] == 0 && v > 0){
				meuArray[i] = v;
				System.out.println("meu log: "+meuArray[i]);
				d++;
				break;
			}
			
		}
		
		if(d == 0){
			retorno = false;
		}else{
			retorno = true;
		}
		
		
		return retorno;
		
	}

	@Override
	public int del(int i) {
		int valor = meuArray[i];
		meuArray[i] = 0;
		
		return valor;
	}

	@Override
	public int size() {
		int quant =0;
		for (int i = 0; i < meuArray.length; i++) {
			if(meuArray[i] != 0){
				quant++;
			}
		}
		return quant;
	}

	@Override
	public double mean() {
		double total =0;
		int divisor = 0;
		for (int i = 0; i < meuArray.length; i++) {
			if(meuArray[i] != 0){
				total += meuArray[i];
				divisor++;
			}
		}
		return total/divisor;
		
	}

	//maior valor
	@Override
	public int greater() {
		int maior = meuArray[0];;
		for (int i = 0; i < meuArray.length; i++) {
			if(meuArray[i] > maior){
				maior = meuArray[i]; 
				
			}
		}
		
		
		return maior;
	}

	//menor valor
	@Override
	public int lower() {
		int menor = meuArray[0];;
		for (int i = 0; i < meuArray.length; i++) {
			if(meuArray[i] < menor){
				menor = meuArray[i]; 	
			}
		}
		
		return menor;
	}

}
