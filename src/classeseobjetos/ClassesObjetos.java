package classeseobjetos;

public class ClassesObjetos {

	public static void main (String args []){

		//Objeto da classe produto
		Produto bebida = new Produto();
		bebida.item = "Bebida";
		bebida.nome = "�gua";
		bebida.modelo = "sem G�s";
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
		livro.nome = "Harry Potter e o C�lice de Fogo";
		livro.modelo = "ilustrado";
		livro.tamanho = 592;
		livro.preco = (float) 17.91;
		livro.quantidade = 1;
		livro.detalhes();
		livro.itemdisponivel();
		

		/*
		 * 
Papelaria (todos)
Cadernos, Blocos de Notas e Recargas
Escrita e Colorir
Material Escolar e Escrit�rio
Mochilas, Estojos e Sacos
Arquivo e Organiza��o
Papel de Impress�o
Presentes e Embrulhos
Revistas, Jornais e Cromos



Livraria (todos)
Literatura
Infantil/Juvenil
Cole��es juvenis
Apoio Escolar e T�cnicos
Plano Nacional de Leitura
Sa�de, Lazer e Bem-estar
		 */

	}

}
