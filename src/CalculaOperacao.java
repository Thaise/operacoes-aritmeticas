import java.util.Scanner;


public class CalculaOperacao {

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		while(true){
			System.out.print("Escolha uma opera��o - 1 = soma / 2 = subtra��o / 3 = multiplica��o / 4 = divis�o : ");
			int operacao = entrada.nextInt();
			if(operacao > 4 || operacao < 1){
				System.out.println("Opera��o indefinida!");
			}else{
				System.out.print("Digite o primeiro n�mero: ");
				double num1 = entrada.nextDouble();
				System.out.print("Digite o segundo n�mero: ");
				double num2 = entrada.nextDouble();
				
				String opera�aoEscolhida = "";
				
				if(operacao == 1){
					opera�aoEscolhida = "soma";
				}else if(operacao == 2){
					opera�aoEscolhida = "subtra��o";
				}else if(operacao == 3){
					opera�aoEscolhida = "multiplica��o";
				}else if(operacao == 4){
					opera�aoEscolhida = "divis�o";
				}
			
				try {
					System.out.println("Voc� escolheu a opera��o "+opera�aoEscolhida+". Resultado = "+efetuarCalculoEscolhido(operacao, num1, num2));
				} catch (CalculaOperacaoException e) {
					System.out.println("O divisor n�o pode ser zero!");
				}
			
			}
		}
	}
	
	public static double efetuarCalculoEscolhido(int operacao, double num1, double num2) throws CalculaOperacaoException {
		
		if(num2 == 0 && operacao == 4){
			throw new CalculaOperacaoException("O divisor n�o pode ser zero!");
		}
		
		double calculo = 0;
		
		switch(operacao){
		
		case 1:
			calculo = num1 + num2;
			break;
		
		case 2:
			calculo = num1 - num2;
			break;
			
		case 3:
			calculo = num1 * num2;
			break;
			
		case 4:
			calculo = num1 / num2;
			break;

		}
		return calculo;
	}

}
