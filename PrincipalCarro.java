package RelaçõesClasses;

public class PrincipalCarro {

	public static void main(String[] args) {
	Motor motor = new Motor("V8");
	Carro carro = new Carro ("mustang", motor);
	
	System.out.println("carro é:" + carro.getModelo()+ "\nMotor: " + motor.getTipo());

	}

}
