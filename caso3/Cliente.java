package caso3;

public class Cliente {
	public static void main(String[] args) {
        // Crear los manejadores
        SolicitudCambioHandler garantiaHandler = new GarantiaHandler();
        SolicitudCambioHandler tecnicoHandler = new TecnicoHandler();
        SolicitudCambioHandler inventarioHandler = new InventarioHandler();
        SolicitudCambioHandler aprobacionGerenteHandler = new AprobacionGerenteHandler();

        // Configurar la cadena de responsabilidad
        garantiaHandler.setNextHandler(tecnicoHandler);
        tecnicoHandler.setNextHandler(inventarioHandler);
        inventarioHandler.setNextHandler(aprobacionGerenteHandler);

        // Crear la solicitud de cambio de producto
        SolicitudCambioProducto request = new SolicitudCambioProducto();
        //.setNombreProducto("Laptop XYZ");
        //request.setPrecio(1200);

        // Iniciar el proceso de manejo de la solicitud
        garantiaHandler.handleRequest(request);
    }
}
