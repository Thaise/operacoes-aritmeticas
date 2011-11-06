import java.util.Scanner;


public class CalculaOperacao {

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		while(true){
			System.out.print("Escolha uma operação - 1 = soma / 2 = subtração / 3 = multiplicação / 4 = divisão : ");
			int operacao = entrada.nextInt();
			if(operacao > 4 || operacao < 1){
				System.out.println("Operação indefinida!");
			}else{
				System.out.print("Digite o primeiro número: ");
				double num1 = entrada.nextDouble();
				System.out.print("Digite o segundo número: ");
				double num2 = entrada.nextDouble();
				
				String operaçaoEscolhida = "";
				
				if(operacao == 1){
					operaçaoEscolhida = "soma";
				}else if(operacao == 2){
					operaçaoEscolhida = "subtração";
				}else if(operacao == 3){
					operaçaoEscolhida = "multiplicação";
				}else if(operacao == 4){
					operaçaoEscolhida = "divisão";
				}
			
				try {
					System.out.println("Você escolheu a operação "+operaçaoEscolhida+". Resultado = "+efetuarCalculoEscolhido(operacao, num1, num2));
				} catch (CalculaOperacaoException e) {
					System.out.println("O divisor não pode ser zero!");
				}
			
			}
		}
	}
	
	public static double efetuarCalculoEscolhido(int operacao, double num1, double num2) throws CalculaOperacaoException {
		
		if(num2 == 0 && operacao == 4){
			throw new CalculaOperacaoException("O divisor não pode ser zero!");
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
