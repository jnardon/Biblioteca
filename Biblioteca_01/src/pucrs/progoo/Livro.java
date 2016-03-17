package pucrs.progoo;

public class Livro {

	private int codigo;
	private String titulo;
	private String autor;
	private String editora;
	private int ano;
	private int total;
	
	public Livro(int codigo, String titulo, String autor, String editora, int ano, int total) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.ano = ano;
		this.total = total;
	}
	
	public Livro(int codigo, String titulo, String autor, String editora, int ano){
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.ano = ano;
		this.total = 1;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

}
