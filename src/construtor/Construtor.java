package construtor;
//Configurando Visibilidade de Atributos e Métodos
//https://www.youtube.com/watch?v=LV2243j4RTQ&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=7
//Métodos Getter, Setter e Construtor
//https://www.youtube.com/watch?v=6i-_R5cAcEc&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=9

public class Construtor {

	public static void main (String args []){

		Produto bebida = new Produto("Bebida", "Água sem Gás", "Perrier", 1, 0.8f, 10);
		bebida.detalhes();
		bebida.itemdisponivel();

		Produto papelaria = new Produto("Tesoura", "Tesoura", "Note", 14, 1.69f, 0);		
		papelaria.detalhes();
		papelaria.itemdisponivel();
		
		Produto livro = new Produto("Livro", "Harry Potter e o Cálice de Fogo", "ilustrado", 592, 17.91f, 1);
		livro.detalhes();
		livro.itemdisponivel();

	}

}
