package model.entities;

public class Menu {
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nOp��es dispon�veis: \n");
		sb.append("Digite: \n");
		sb.append("1 - Para efetuar dep�sitos \n");
		sb.append("2 - Para efetuar saques \n");
		sb.append("3 - Para ver o dinheiro guardado \n");
		return sb.toString();
	}
	
	
}
