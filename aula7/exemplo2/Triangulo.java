package exemplo2;

public class Triangulo extends FormaGeometrica{
	public Triangulo() {
		this.representacao = "     * \n "
				+ "  *   *\n *       *\n***********";
	}
	public String representacao() {
		return representacao;
	}
}
