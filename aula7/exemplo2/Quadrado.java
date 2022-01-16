package exemplo2;

public class Quadrado extends FormaGeometrica{
	public Quadrado() {
		this.representacao = "######\n# "
				+ "   #\n#    #\n######";
	}
	public String representacao() {
		return representacao;
	}
}
