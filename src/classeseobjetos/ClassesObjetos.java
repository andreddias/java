package classeseobjetos;

public class ClassesObjetos {

	public static void main (String args []){

		//Objeto da classe produto
		Produto bebida = new Produto();
		bebida.item = "Bebida";
		bebida.nome = "Água";
		bebida.modelo = "sem Gás";
		bebida.tamanho = 1;
		bebida.preco = (float) 0.8;
		bebida.quantidade = 10;
		bebida.detalhes();
		bebida.itemdisponivel();
		
		Produto papelaria = new Produto();
		papelaria.item = "Tesoura";
		papelaria.nome = "Tesoura";
		papelaria.modelo = "Note";
		papelaria.tamanho = 14;
		papelaria.preco = (float) 1.69;
		papelaria.quantidade = 0;
		papelaria.detalhes();
		papelaria.itemdisponivel();
		
		Produto livro = new Produto();
		livro.item = "Livro";
		livro.nome = "Harry Potter e o Cálice de Fogo";
		livro.modelo = "ilustrado";
		livro.tamanho = 592;
		livro.preco = (float) 17.91;
		livro.quantidade = 1;
		livro.detalhes();
		livro.itemdisponivel();
		

	}

}
