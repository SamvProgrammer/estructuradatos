/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samv
 */
public class principal {

    public static void main(String[] args) {

        int[] arreglo = {10, 4, 6, 52, 0, 20, 2, 6, 5, 2, 8};

        ordenacionShell(arreglo);

        for (int x = 0; x < arreglo.length; x++) {
            System.out.print(arreglo[x] + " ");
        }

    }

    public static void intertacambiarValor(int[] a, int i, int j) {
        //4
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;

    }

    public static void ordIntercambio(int[] a) {
        //[0,10,6,52,4,20,2,6,5,2,8]
        int i, j;

        for (i = 0; i < a.length - 1; i++) {

            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {

                    intertacambiarValor(a, i, j);

                }
            }

        }

    }
    
    
    public static void ordenacionSeleccion(int[] a){
       //{10, 4, 6, 52, [0], 20, 2, 6, 5, 2, 8};
        
        int indiceMenor,i,j,n;
        
        n =  a.length;
        
        for(i = 0; i < n-1; i++){
            
            //conmienza de la exporacion desde el indice 1;
            
            indiceMenor = i;
            
            for(j = i+1; j < n; j++){
            
                
                if(a[j]< a[indiceMenor]){
                 indiceMenor = j;
                }
                
            }
            
            
            if(i != indiceMenor){
                intertacambiarValor(a, i, indiceMenor);
            }
        
        }
        
    }
    
    
    public static void ordenacionInserccion(int[] a){
      
        //{0, 4, 6, 10,52 , 20, 2, 6, 5, 2, 8}
        int i,j;
        int aux;
        
        for(i = 1; i < a.length; i++){
        
            j = i;
            aux = a[i];
            
            
            while(j > 0 && aux < a[j-1]){
            
                a[j]= a[j-1];
                j--;
                
            }
            
            a[j] = aux;
            
            
        }
        
    }
    
    
    public static void ordenacionShell(int[] a){
    
        
        int intervalo,i,j,k;
        
        int n = a.length;
        
        intervalo = n / 2;
        
        
        while(intervalo > 0){
        
            for(i = intervalo; i < n; i++){
            
                j = i-intervalo;
                
                while(j >= 0){
                  
                    k = j+intervalo;
                    
                    if(a[j] <= a[k]){
                    
                        j = -1;
                        
                    }else{
                        intertacambiarValor(a, j, j+1);
                        j -= intervalo;
                    }
                    
                }
                
                
                intervalo = intervalo / 2;
                
            }
        }
        
    }
}
