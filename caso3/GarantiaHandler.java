package caso3;

public class GarantiaHandler implements SolicitudCambioHandler{
	private SolicitudCambioHandler nextHandler;
	
	@Override
	public void handleRequest(SolicitudCambioProducto request) {
		// Verificar si el producto está en garantía y realizar acciones necesarias
        // (Por simplicidad, asumiremos que siempre está en garantía en este ejemplo)
       System.out.println("El producto " + request.getNombreProducto() + " está en garantía.");
       
        // Pasar la solicitud al siguiente manejador en la cadena
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
	}

	@Override
	public void setNextHandler(SolicitudCambioHandler nextHandler) {
		this.nextHandler = nextHandler;
		
	}

}
