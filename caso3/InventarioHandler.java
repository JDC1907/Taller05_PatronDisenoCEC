package caso3;

public class InventarioHandler implements SolicitudCambioHandler{
private SolicitudCambioHandler nextHandler;
	
	@Override
	public void handleRequest(SolicitudCambioProducto request) {
		// Verificar la existencia del producto en bodega y realizar acciones necesarias
        System.out.println("El tipo de fallo del producto " + request.getNombreProducto() + " tiene existencias en bodega.");
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
