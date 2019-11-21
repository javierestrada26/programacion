package ventaboletos;

import java.util.Scanner;

/**
 *
 * @author JAVIER
 */
public class Teatro {
// Atributos

    public int id;// identificador del boleto
    public int zona;
    public String nombre;
    public double precio_boleto;

    // Constructor vacio

    public Teatro() {
    }
// Constructor con parametros

    public Teatro(int id, int zona, String nombre, double precio_boleto) {
        this.id = id;
        this.zona = zona;
        this.nombre = nombre;
        this.precio_boleto = precio_boleto;
    }
// --------------METODOS GET Y SET-------------------------//

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio_boleto() {
        return precio_boleto;
    }

    public void setPrecio_boleto(double precio_boleto) {
        this.precio_boleto = precio_boleto;
    }
// --------------FIN DE LOS METODOS GET Y SET-------------------------//
    // Metodo para asignar el precio del boleto segun su tipo de zona

    public double obtenerPrecioBoleto() {
        if (this.zona == 1) { // Precio Normal para  Zona Principal
            this.precio_boleto = 25;
        }
        if (this.zona == 2) {// Precio Normal para  Zona Palco
            this.precio_boleto = 70;
        }
        if (this.zona == 3) {// Precio Normal para  Zona Central
            this.precio_boleto = 20;
        }
        if (this.zona == 4) {// Precio Normal para  Zona Lateral
            this.precio_boleto = 15.5;
        }
        return precio_boleto;
    }

    // Metodo toString que permite presentar en cadena

    public String toString() {
        return String.format("Id : %d\nZona : %s\nComprador : %s\nPrecio de Boleto"
                + ": %.2f dólares", getId(), zona, nombre, precio_boleto);
    }
}

class Entradas_Abonado extends Teatro { // Aplicando la Herencia
// constructor de la clase EntradasDeAbonado

    public Entradas_Abonado(int id, int zona, String nombre, double precio_boleto) {
        super(id, zona, nombre, precio_boleto);
    }
// Método sobreescribido 
    // Entradas de Abonado : Su precio de boleto es el mismo precio para abonados de la zona elegida

    @Override
    public double obtenerPrecioBoleto() {
        if (this.zona == 1) { // Precio Normal para  Zona Principal
            this.precio_boleto = 17.5;
        }
        if (this.zona == 2) { // Precio Normal para  Zona Palco
            this.precio_boleto = 40;
        }
        if (this.zona == 3) { // Precio Normal para  Zona Central
            this.precio_boleto = 14;
        }
        if (this.zona == 4) { // Precio Normal para  Zona Lateral
            this.precio_boleto = 10;
        }
        return precio_boleto;
    } // Fin del metodo
}//Fin de la clase Entradas_Abonado

class Entradas_Normales extends Teatro {

    // Costructor de la clase EntradaNormales

    public Entradas_Normales(int id, int zona, String nombre, double precio_boleto) {
        super(id, zona, nombre, precio_boleto);
    }

    // método redifinido

    @Override
    public double obtenerPrecioBoleto() {
        precio_boleto = super.obtenerPrecioBoleto();
        return precio_boleto;
    }
}//Fin de la clase Entradas_Normales

class Entradas_Reducidas extends Teatro {

    // atributo de la clase   

    public String tipo_descuento;
// Se crea constructor

    public Entradas_Reducidas(String tipo_descuento) {
        this.tipo_descuento = tipo_descuento;
    }

    public Entradas_Reducidas(String tipo_descuento, int id, int zona, String nombre, double precio_boleto) {
        super(id, zona, nombre, precio_boleto);
        this.tipo_descuento = tipo_descuento;
    }

    public String getTipo_descuento() {
        return tipo_descuento;
    }
// -------------- METODOS GET Y SET-------------------------//

    public void setTipo_descuento(String tipo_descuento) {
        this.tipo_descuento = tipo_descuento;
    }
// --------------FIN DE LOS METODOS GET Y SET-------------------------//

    @Override
// Sobreescribimos el metodo obtenerPrecioBoleto , segun el descuento que representen las entradas reducidas.
    public double obtenerPrecioBoleto() {
        if ((this.zona == 1) && (this.tipo_descuento.equals("a")
                || this.tipo_descuento.equals("b"))) {
            precio_boleto = super.obtenerPrecioBoleto() - super.obtenerPrecioBoleto() * 0.15;
        }
        if ((this.zona == 2) && (this.tipo_descuento.equals("a")
                || this.tipo_descuento.equals("b"))) {
            precio_boleto = super.obtenerPrecioBoleto() - super.obtenerPrecioBoleto() * 0.15;
        }
        if ((this.zona == 3) && (this.tipo_descuento.equals("a")
                || this.tipo_descuento.equals("b"))) {
            precio_boleto = super.obtenerPrecioBoleto() - super.obtenerPrecioBoleto() * 0.15;
        }
        if ((this.zona == 4) && (this.tipo_descuento.equals("a")
                || this.tipo_descuento.equals("b"))) {
            precio_boleto = super.obtenerPrecioBoleto() - super.obtenerPrecioBoleto() * 0.15;
        }
        return precio_boleto;
    }

    @Override
    // se redifine el método toString();
    public String toString() {
        return String.format("Identificador : %d\nZona : %s\nNombre : %s\nTipo_Descuento: "
                + "%s\nPrecio : %.2f dólares", getId(), zona, nombre, tipo_descuento, precio_boleto);
    }
}// fin de la clase

class Prueba {

    public static void main(String[] args) {
        // *************SALIDA DE DATOS EN PANTALLA************//
        System.out.println("\t******TEATRO******");
        System.out.println("Venta de Entradas");
        System.out.println("_____________________________________________________________________________________");
        System.out.print("| Opcion |\tNombreZona |\tNumeroLocalidades |\tPrecioNormal |\tPrecioAbonado|\n");
        System.out.println("_____________________________________________________________________________________");
        System.out.println("|  1\t\tPrincipal\t\t200\t\t25E\t\t17.5E\t     |");
        System.out.println("|  2\t\tPalco\t\t\t40\t\t70E\t\t40E\t     |");
        System.out.println("|  3\t\tCentral\t\t\t400\t\t20E\t\t14E\t     |");
        System.out.println("|  4\t\tLateral\t\t\t100\t\t15.5E\t\t105E\t     |");
        // Objetos 
        Scanner entrada = new Scanner(System.in);
        Entradas_Normales entrada_Normal = new Entradas_Normales(0, 0, null, 0);
        Entradas_Abonado entrada_Abonada = new Entradas_Abonado(0, 0, null, 0);
        Entradas_Reducidas entrada_Reducida = new Entradas_Reducidas(null, 0, 0, null, 0);
        //Fin de Objetos
        // Variables para ingresar datos
        int respuesta;
        String opcion_menu;
        String opcion_descuento;
        int opcion_zona;
        int opcion_cosulta;
        boolean corrida = true;
        int cont = 0;
        int cont_zonaPrincipal = 0;
        int cont_zonaPalco = 0;
        int cont_zonaCentral = 0;
        int cont_zonaLateral = 0;
        int opcion_PersonaDesc;
        int numIdent;
        String usuario;
        //PROCESOS
        System.out.println("MENU DE OPCIONES DE ENTRADAS");
        System.out.println("[A]. Venta de Entrada");
        System.out.println("[B]. Consulta de Entrada");
        System.out.println("[C]. Informe de Zona");
        System.out.println("\tTIPO DE DESCUENTO");
        System.out.println("\t[a].Estudiante ");
        System.out.println("\t[b].Pensionado");
        System.out.println("\t[c].Abonado");
        while (corrida = true) {
            // *************SALIDA DE DATOS EN PANTALLA************//
            System.out.println("Escoja opcion de menu de Entrada(A-C): ");
            opcion_menu = entrada.nextLine();
            switch (opcion_menu) {
                case "A": // MENU DE VENTAS DE ENTRADAS

                    System.out.println("Escoja un tipo de descuento(a-c): ");
                    opcion_descuento = entrada.nextLine();
                    switch (opcion_descuento) {
                        case "a": // TIPO DE DESCUENTO:Normal
                            System.out.println("Escoja un zona(1-4): ");
                            // AGREGANDO AL METODO SET EL NOMBRE DE SU ZONA
                            opcion_zona = entrada.nextInt();
                            entrada.nextLine();
                            if (opcion_zona == 1) {
                                entrada_Normal.setZona(1);
                                cont_zonaPrincipal++;
                            }
                            if (opcion_zona == 2) {
                                entrada_Normal.setZona(2);
                                cont_zonaPalco++;
                            }
                            if (opcion_zona == 3) {
                                entrada_Normal.setZona(3);
                                cont_zonaCentral++;
                            }
                            if (opcion_zona == 4) {
                                entrada_Normal.setZona(4);
                                cont_zonaLateral++;
                            }

                            //PROCESOS
                            System.out.println("===================");
                            System.out.printf("Ingrese el nombre del usuario del boleto:");
                            usuario = entrada.nextLine();
                            entrada_Normal.setNombre(usuario);
                            cont++;
                            entrada_Normal.setId(cont);
                            entrada_Normal.obtenerPrecioBoleto();
                            // SALIDA DE DATOS EN PANTALLA
                            // Presenta id y precio de la entrada.
                            System.out.println("******Boleto******");
                            System.out.println("******************");
                            System.out.println("id: " + entrada_Normal.getId());
                            System.out.println("Precio: " + entrada_Normal.obtenerPrecioBoleto());
                            break;
                        case "b":// TIPO DE DESCUENTO:Abonado

                            System.out.println("Escoja el nombre de la zona(1-4");
                            opcion_zona = entrada.nextInt();
                            entrada.nextLine();
                            if (opcion_zona == 1) {
                                entrada_Abonada.setZona(1);
                                cont_zonaPrincipal++;
                            }
                            if (opcion_zona == 2) {
                                entrada_Abonada.setZona(2);
                                cont_zonaPalco++;
                            }
                            if (opcion_zona == 3) {
                                entrada_Abonada.setZona(3);
                                cont_zonaCentral++;
                            }
                            if (opcion_zona == 4) {
                                entrada_Abonada.setZona(4);
                                cont_zonaLateral++;
                            }

                            System.out.println("===================");
                            System.out.printf("Ingrese el nombre del usuario del boleto:");
                            usuario = entrada.nextLine();
                            entrada_Abonada.setNombre(usuario);
                            cont++;
                            entrada_Abonada.setId(cont);
                            entrada_Abonada.obtenerPrecioBoleto();
                            //SALIDA DE DATOS EN PANTALLA
                            // Presenta id y precio de la entrada.
                            System.out.println("******Boleto******");
                            System.out.println("******************");
                            System.out.println("id: " + entrada_Abonada.getId());
                            System.out.println("Precio: " + entrada_Abonada.obtenerPrecioBoleto());
                            System.out.println("===================");
                            break;
                        case "c"://// TIPO DE DESCUENTO:REDUCIDA

                            System.out.println("Escoja opcion:\n[1].Estudiante\n[2]Pensionista");
                            opcion_PersonaDesc = entrada.nextInt();
                            // 
                            if (opcion_PersonaDesc == 1) {
                                entrada_Reducida.setTipo_descuento("Estudiante");
                            } else {
                                entrada_Reducida.setTipo_descuento("Pensionista");
                            }
                            System.out.println("Escoja el nombre de la zona(1-4)");
                            opcion_zona = entrada.nextInt();
                            entrada.nextLine();
                            if (opcion_zona == 1) {
                                entrada_Reducida.setZona(1);
                                cont_zonaPrincipal++;
                            }
                            if (opcion_zona == 2) {
                                entrada_Reducida.setZona(2);
                                cont_zonaPalco++;
                            }
                            if (opcion_zona == 3) {
                                entrada_Reducida.setZona(3);
                                cont_zonaCentral++;
                            }
                            if (opcion_zona == 4) {
                                entrada_Reducida.setZona(4);
                                cont_zonaLateral++;
                            }
                            // Procesos
                            System.out.println("===================");
                            System.out.printf("Ingrese el nombre del usuario del boleto:");
                            usuario = entrada.nextLine();
                            entrada_Reducida.setNombre(usuario);
                            cont++;
                            entrada_Reducida.setId(cont);
                            entrada_Reducida.obtenerPrecioBoleto();
                            //SALIDA DE DATOS EN PANTALLA
                            // Presenta id y precio de la entrada.
                            System.out.println("******Boleto******");
                            System.out.println("******************");
                            System.out.println("id: " + entrada_Reducida.getId());
                            System.out.println("Precio: " + entrada_Reducida.obtenerPrecioBoleto());
                            System.out.println("===================");
                            break;
                    }// TERMINA EL MENU VENTAS DE ENTRADAS
                    break;
                case "B":// Menu CONSULTA DE VENTAS
                    System.out.println("Escoja consulta:\n[1]Entrada Nomal\n[2]Entrada Abonada\n[3]Entrada Reducida\n");
                    opcion_cosulta = entrada.nextInt();
                    System.out.println("CONSULTANDO...............");
                    // Segun el tipo de entrada , muestra la informacion genera en el menu ventas
                    if (opcion_cosulta == 1) {
                        System.out.println("Ingrese numero de identificador de la entrada");
                        numIdent = entrada.nextInt();
                        if (numIdent == entrada_Normal.getId()) {
                            System.out.println("DETALLES DEL BOLETO");
                            System.out.println("==================");
                            System.out.println(entrada_Normal);
                            System.out.println("==================");
                        }
                    }
                    if (opcion_cosulta == 2) {
                        System.out.println("Ingrese numero de identificador de la entrada");
                        numIdent = entrada.nextInt();
                        if (numIdent == entrada_Abonada.getId()) {
                            System.out.println("DETALLES DEL BOLETO");
                            System.out.println("==================");
                            System.out.println(entrada_Abonada);
                            System.out.println("==================");
                        }
                    }
                    if (opcion_cosulta == 3) {
                        System.out.println("Ingrese numero de identificador de la entrada");
                        numIdent = entrada.nextInt();
                        if (numIdent == entrada_Reducida.getId()) {
                            System.out.println("DETALLES DEL BOLETO");
                            System.out.println("==================");
                            System.out.println(entrada_Reducida);
                            System.out.println("==================");
                        }
                        break;
                    }// TERMINA EL MENUCONSULTA DE VENTAS
                    break;
                case "C":// MENU INFORMACION DE ZONA
                    System.out.println("Escoja el nombre de la zona (1-4)");
                    opcion_zona = entrada.nextInt();
                    //Segun la zona elegida informa cuantas zonas quedan disponibles y la recaudacion que hay en total.
                    if (opcion_zona == 1) {
                        System.out.println("====================================");
                        System.out.println("Entradas vendidas zona Principal: " + cont_zonaPrincipal + " de 200");
                        System.out.println("Recadudación de : " + (entrada_Normal.obtenerPrecioBoleto() + entrada_Abonada.obtenerPrecioBoleto() + entrada_Reducida.obtenerPrecioBoleto()));
                        System.out.println("====================================");
                    }
                    if (opcion_zona == 2) {
                        System.out.println("====================================");
                        System.out.println("Entradas vendidas zona Palco: " + cont_zonaPalco + " de 40");
                        System.out.println("Recadudación de : " + entrada_Normal.obtenerPrecioBoleto() + entrada_Abonada.obtenerPrecioBoleto() + entrada_Reducida.obtenerPrecioBoleto());
                        System.out.println("====================================");
                    }
                    if (opcion_zona == 3) {
                        System.out.println("====================================");
                        System.out.println("Entradas vendidas zona Central: " + cont_zonaCentral + " de 400");
                        System.out.println("Recadudación de : " + entrada_Normal.obtenerPrecioBoleto() + entrada_Abonada.obtenerPrecioBoleto() + entrada_Reducida.obtenerPrecioBoleto());
                        System.out.println("====================================");
                    }
                    if (opcion_zona == 4) {
                        System.out.println("====================================");
                        System.out.println("Entradas vendidas zona Lateral: " + cont_zonaLateral + " de 100");
                        System.out.println("Recadudación de : " + entrada_Normal.obtenerPrecioBoleto() + entrada_Abonada.obtenerPrecioBoleto() + entrada_Reducida.obtenerPrecioBoleto());
                        System.out.println("====================================");
                    }// TERMINA EL MENU DE INFORMACION DE ZONA

                default:
                    System.out.println("Esa opción de Menu  no esxiste");// Si no elige una opcion del menu presentara este mensaje
            }
            System.out.println("Desea ingesar nuevamente al menu [1]Si/[2]No");
            respuesta = entrada.nextInt();
            if (respuesta == 2) {
                corrida = false;
                break;
            } else {
                opcion_menu = entrada.nextLine();
                System.out.print('\u000C');
            }
        }

    }// Fin del Metodo Main
} // Fin de la clase Prueba
