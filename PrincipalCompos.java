package RelaçõesClasses;

public class PrincipalCompos {

	public static void main(String[] args) {
	 
		PessoaComposicao pessoa = new PessoaComposicao("João", 80);
		
		System.out.println(pessoa.getNome() + "tem a média de " + pessoa.getCoracao() + "batimentos");

	}

}
