package caso3;

public class TecnicoHandler implements SolicitudCambioHandler{
	private SolicitudCambioHandler nextHandler;
	
	@Override
	public void handleRequest(SolicitudCambioProducto request) {
		// Verificar si el tipo de fallo está cubierto por la garantía y realizar acciones necesarias
        System.out.println("El tipo de fallo del producto " + request.getNombreProducto() + " está cubierto por la garantía.");
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
