package CASO2;

public class DepartamentoLogistica {
	
	private DsitribucionArtStrategy dsitribucionArtStrategy;
	
	public void setDsitribucionArtStrategy(DsitribucionArtStrategy strategy){ 
		this.dsitribucionArtStrategy = strategy;
	}
	
	public void enviarArticulo(Articulos[] articulos, DsitribucionArtStrategy tipoEnvio ) {
		dsitribucionArtStrategy.dsitribucionArtStrategy(articulos);
	}
}
