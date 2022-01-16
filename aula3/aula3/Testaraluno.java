package aula3;

public class Testaraluno {

	public static void main(String[] args) {
		Aluno alunoLead = new Aluno("Ana", 2, 8.8, 9.7);
		System.out.println(alunoLead.nome);
		System.out.println(alunoLead.codigo);
		System.out.println(alunoLead.nota1);
		System.out.println(alunoLead.nota2);
		   
		NovoAluno aluno1 = new NovoAluno();
		aluno1.setNome("Joana");
		aluno1.setCodigo(1);
		aluno1.setNota1(9.0);
		aluno1.setNota2(9.2);
		
		System.out.println();
		
		System.out.println("Nome: " +aluno1.getNome());
		System.out.println("Código: " +aluno1.getCodigo());
		System.out.println("1ª nota: " +aluno1.getNota1());
		System.out.println("2ª nota: " +aluno1.getNota2());
		aluno1.media();
		
	}
}
