import java.util.Random;      // 3.22

public class Ejercicio3{  

    public static void main(String[]arg) {

        int [] a= {1,2,3,4};
        int [] b= {1,2,3,4};
        int [] c= {-1,-1,-1,-1};

        Random r = new Random();
        int z, w=0;

        do{
            z=r.nextInt(4);
            if (z!=c[0] && z!=c[1] && z!=c[2] && z!=c[3]){
                c[w]=z;
                w++;
            }
        } while (w<=3);

        for (int x=0; x<4; x++){
            a[x]=b[c[x]];
            
        }

        System.out.println("");
        System.out.println("El ordenamiento aleatorio del Arreglo [1  2  3  4 ] es:");
        System.out.print("               [");
        for (int x=0; x<4; x++){
            System.out.print(a[x]+"  ");
        }
        System.out.println("]");







    }
}