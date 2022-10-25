public class Ejercicio36{  

    public static void main(String[]arg) {

            Enlazada lista = new Enlazada();

            lista.agregar("Hola");
            lista.agregar(1234);
            lista.agregar("Que tal");
            lista.agregar(3.1416);

            System.out.print("El penultimo elemento es "+ lista.obtener(lista.size()-2));


    }
}