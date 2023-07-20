package caso3;

public class AprobacionGerenteHandler implements SolicitudCambioHandler{
	private SolicitudCambioHandler nextHandler;
	@Override
	public void handleRequest(SolicitudCambioProducto request) {
		if (request.getPrecio() > 1000) {
            // Obtener la aprobación del gerente para el cambio de producto
            System.out.println("Se requiere la aprobación del gerente para el producto " + request.getNombreProducto());
        }
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
