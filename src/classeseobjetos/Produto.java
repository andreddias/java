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
			System.out.println(this.tamanho +" p�ginas");
		}
		else if (item == "Tesoura"){
			System.out.println(this.tamanho +" cent�metros");
		}

		System.out.println("Pre�o: �" + this.preco);
	}

	public void itemdisponivel(){
		if (quantidade > 0){
			System.out.println("Produto em estoque");
		} else {
			System.out.println("Produto indispon�vel");
		}
		System.out.println("\n");
	}

	//	medidas


	/* comprimento
	 * Quil�metro(km)
	Hect�metro(hm)
	Decametro(dam)
	Metro(m)
	Dec�metro(dm)
	Cent�metro(cm)
	Mil�metro(mm)

	 *
	 *
	 *capacidade
	 *     Quilolitro(kl)
	Hectolitro(hl)
	Decalitro(dal)
	Litro(l)
	Decilitro(dl)
	Centilitro(cl)
	Mililitro(ml)
	 */

	/*
	 * Quilogrma(kg)
	Hectograma(hg)
	Decagrama(dag)
	Grama(g)
	Decigrama(dg)
	Centigrama(cg)
	Miligrama(mg)
	 */



}
