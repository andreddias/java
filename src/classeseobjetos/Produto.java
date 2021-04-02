package classeseobjetos;

public class Produto {

	String nome;
	String modelo;
	int tamanho;
	float preco;
	int quantidade;
	String item;

	public void detalhes(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Modelo: " + this.modelo);

		if (item == "Bebida"){
			System.out.println(this.tamanho +" l");
		}
		else if(item == "Livro"){
			System.out.println(this.tamanho +" páginas");
		}
		else if (item == "Tesoura"){
			System.out.println(this.tamanho +" centímetros");
		}

		System.out.println("Preço: €" + this.preco);
	}

	public void itemdisponivel(){
		if (quantidade > 0){
			System.out.println("Produto em estoque");
		} else {
			System.out.println("Produto indisponível");
		}
		System.out.println("\n");
	}


}
