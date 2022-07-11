import java.io.*;

public class inputOutput_1 {
    public static void main(String[] args) throws FileNotFoundException {

        //leer un stream de bytes de un solo golpe
      try {
            InputStream fichero = new FileInputStream("/etc/passwd");
            try {
                byte[] datos = fichero.readAllBytes();    //un bytestream es un array de bytes; readAllBytes => lee el fichero íntegro en memoria
                for (byte dato: datos){
                    System.out.print((char)dato);
                }
            }catch(IOException e){
             System.out.println("Se ha producido una excepción: " + e.getMessage());
            }
        }catch(FileNotFoundException e){
            System.out.println("Se ha producido una excepción: " + e.getMessage());  //o bien getLocalizedMessage() por si hay traducción
        }

        System.out.println("---------------");

        //otra forma: leyendo el stream byte a byte

        try {
            InputStream fichero = new FileInputStream("/etc/passwd");
            try {
                int dato = fichero.read();    // read => lee byte a byte (el type es int porque al leer los caracteres vienen en código ASCII)
                while(dato!=-1){
                    System.out.print((char)dato);
                    dato = fichero.read();  //actualizo el valor de dato
                }

            }catch(IOException e){
                System.out.println("Se ha producido una excepción: " + e.getMessage());
            }
        }catch(FileNotFoundException e){
            System.out.println("Se ha producido una excepción: " + e.getMessage());  //o bien getLocalizedMessage() por si hay traducción
        }

        System.out.println("---------------");

        //otra forma leyendo el stream por chunks predefinidos
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");
            try {
                byte[] datos = new byte[5];
                int dato = fichero.read(datos);    // read(datos) => lee el stream en chunks de 5 bytes
                while(dato!=-1){
                    System.out.print(datos.toString());
                    dato = fichero.read(datos);  //actualizo el valor de dato
                }

            }catch(IOException e){
                System.out.println("Se ha producido una excepción: " + e.getMessage());
            }
        }catch(FileNotFoundException e){
            System.out.println("Se ha producido una excepción: " + e.getMessage());  //o bien getLocalizedMessage() por si hay traducción
        }

        System.out.println("---------------");

        //BufferedInputStream
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
            try {
                int dato = ficheroBuffer.read();
                while(dato!=-1){
                    System.out.print((char)dato);
                    dato = ficheroBuffer.read();  //actualizo el valor de dato
                }
            }catch(IOException e){
                System.out.println("Se ha producido una excepción: " + e.getMessage());
            }
        }catch(FileNotFoundException e){
            System.out.println("Se ha producido una excepción: " + e.getMessage());  //o bien getLocalizedMessage() por si hay traducción
        }

    }
}
