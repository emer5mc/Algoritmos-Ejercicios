public class Ejercicio1{  

    public static void main(String[]arg) {

        int A[] ={1,2,1,3};
        int b, e=0;
        int c=0;

        for (int x=0; x<4; x++){
            b=A[x];
            for (int y=0; y<4; y++){
                if (A[y]==b){
                    c++;
                }
                if(c>=2){
                    e=A[x];
                }
            }
            c=0;
        }
        System.out.print("El valor que esta repetido es "+ e);


    }


}