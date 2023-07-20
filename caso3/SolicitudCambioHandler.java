package caso3;

public interface SolicitudCambioHandler {
	public void handleRequest(SolicitudCambioProducto request);
    public void setNextHandler(SolicitudCambioHandler nextHandler);
}
