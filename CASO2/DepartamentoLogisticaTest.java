package CASO2;

public class DepartamentoLogisticaTest {

	public static void main(String[] args) {
		DepartamentoLogistica logistica = new DepartamentoLogistica();

		// Seleccionar la estrategia de distribución deseada (por ejemplo, distribución automotriz)
		DsitribucionArtStrategy estrategiaAutomotriz = new TransporteAutomotriz();
		logistica.setDsitribucionArtStrategy(estrategiaAutomotriz);

		// Ejecutar la distribución utilizando la estrategia automotriz
		logistica.enviarArticulo();

		// Cambiar la estrategia a distribución ciclista en tiempo de ejecución
		DsitribucionArtStrategy estrategiaCiclista = new TransporteCiclista();
		logistica.setDsitribucionArtStrategy(estrategiaCiclista);

		// Ejecutar la distribución utilizando la estrategia ciclista
		logistica.enviarArticulo();
		

	}

}
