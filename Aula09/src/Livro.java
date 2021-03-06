
public  class Livro implements Publicacao {
	private String tilulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	
	public String detalhes() {
		return "Livro tilulo = " + tilulo + "\n, autor =" + autor + "\n, totPaginas =" + totPaginas + "\n, pagAtual=" + pagAtual
				+ "\n, aberto =" + aberto + "\n, leitor =" + leitor + "]";
	}

	

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		this.aberto = true;
	}



	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.aberto = false;
	}



	@Override
	public void folhear(int p) {
		// TODO Auto-generated method stub
		this.pagAtual = p;
	}



	@Override
	public void avancarPag() {
		// TODO Auto-generated method stub
		this.pagAtual++;
	}



	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		this.pagAtual--;
	}



	public Livro(String tilulo, String autor, int totPaginas, Pessoa leitor) {
		this.tilulo = tilulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	

	public String getTilulo() {
		return tilulo;
	}

	public void setTilulo(String tilulo) {
		this.tilulo = tilulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
}

