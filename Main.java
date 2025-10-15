package RelaçõesClasses;

public class Main {

	public static void main(String[] args) {
		Universidade universidade = new Universidade("usp");

		Estudante estudante = new Estudante("joão", universidade);
		System.out.println("estudante " + estudante.getNome() + "\nUniversidade: " + universidade.getNome());

	}

}
