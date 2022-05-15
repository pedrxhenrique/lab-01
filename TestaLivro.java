public class TestaLivro {

	public static void main(String args []) {
		
        Livro livro = new Livro();
        livro.settitulo("Branca de Neve\n");
        livro.setautor("Jacob Grim\n");
        livro.setisbn("Nao Sei\n");
        livro.setdescricao("\nBranca de Neve é um conto de fadas clássico originário da tradição oral alemã, que foi compilado pelos Irmãos Grimm e publicado entre os anos de 1817 e 1822, num livro com várias outras fábulas, intitulado Kinder-und Hausmärchen.");

        System.out.println(livro);
	}

}
