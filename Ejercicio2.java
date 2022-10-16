public class Ejercicio2{  

    public static void main(String[]arg) {

        int [] a ={1,2,1,3,2,4,5,4,5,6,6,7,8,9,10};
        int [] n={-1,-1,-1,-1,-1};
        int b=0,c=0, d=0;

        
        for (int x=0; x<15; x++){
            for (int y=0; y<15; y++){
                if (a[y]==a[x]){
                    c++;
                    if(c==2){
                        for( int k=0; k<5; k++){
                            if (n[k]==a[y]){
                                b=1;
                            }
                        }
                        if (b==0){
                            n[d]=a[y];
                            d++;
                        } 
                        b=0;
                        c=0;    
                        }
                        
                    } 
                }                     
            }

        System.out.println("Los valores que se repiten son:");
        for (int w=0; w<5; w++){ 
            System.out.print(n[w]+" "); 
        } 


    }
}