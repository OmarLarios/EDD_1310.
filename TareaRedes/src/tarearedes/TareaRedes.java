package tarearedes;


public class TareaRedes {

    public static void main(String[] args) {

        ArchivoCSV archivo= new ArchivoCSV();    //crear objeto
        archivo.leerArchivo("C:\\Users\\omarl\\Downloads\\presenciaredes.csv");
         archivo.difTW();
         archivo.creFbyTw();
       
}
    
}
//Mostrar en pantalla la diferencia de seguidores (followers) en Twitter entre el mes de enero y junio.
// Calcular el promedio de crecimiento de Twitter y Facebook entre los meses de enero a junio.