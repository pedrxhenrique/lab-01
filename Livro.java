public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private String descricao;

       public String gettitulo() {
		return titulo;
	}
	public void settitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getautor() {
		return autor;
	}
	public void setautor(String autor) {
		this.autor = autor;
	}
	public String getisbn() {
		return isbn;
	}
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	public String getdescricao() {
		return descricao;
	}
	public void setdescricao(String descricao) {
		this.descricao = descricao;
        }
        @Override
	public String toString() {
		return "titulo: " + this.titulo + "autor: " + this.autor +
			   "isbn: " + this.isbn + "descricao: " + this.descricao;
}
}
