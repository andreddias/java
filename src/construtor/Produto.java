package construtor;

public class Produto {

	private String nome;
	private String modelo;
	private int tamanho;
	private float preco;
	private int quantidade;
	private String item;

	public Produto(String i, String n, String m, int t, float p, int q){
		this.item = i;
		this.nome = n;
		this.modelo = m;
		this.tamanho = t;
		this.preco = p;
		this.quantidade = q;
	}

	public void detalhes(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Modelo: " + this.getModelo());
		
		if (this.getItem() == "Bebida"){
			System.out.println("Tamanho: " + this.getTamanho() +" litro");			
		} else if (this.getItem() == "Tesoura"){
			System.out.println("Tamanho: " + this.getTamanho() +" centímetros");
		} else if (this.getItem() == "Livro"){
			System.out.println("Tamanho: " + this.getTamanho() +" páginas");
		}
		System.out.println("Preço: " +"€" + this.getPreco());
		System.out.println("Quantidade: " + this.getQuantidade());

	}
	
	public String getItem(){
		return this.item;
	}
	
	public void setItem(String i){
		this.item = i;
		
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome (String n){
		this.nome = n;
	}

	public String getModelo(){
		return this.modelo;
	}

	public void setModelo(String n){
		this.modelo = n;
	}
	
	public int getTamanho(){
		return this.tamanho;
	}
	
	public void setTamanho(int t){
		this.tamanho = t;
	}
	
	public float getPreco(){
		return this.preco;
	}
	
	public void setPreco(float p){
		this.preco = p;
	}
	
	public int getQuantidade(){
		return this.quantidade;
	}
	
	public void setQuantidade(int q){
		this.quantidade = q;
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
