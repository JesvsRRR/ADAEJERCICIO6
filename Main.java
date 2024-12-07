import java.util.Scanner;


public class Main {
    
    public static void EspiralCuadrada(int d,int e){
    Scanner sc = new Scanner(System.in);    
    int[][] Matriz = new int[d][e];
    int[] Elementos = new int[d*e];
    
    for(int i=0; i < d; i++){
        for(int j=0; j < e;j++){
            System.out.print("["+i+"]"+"[" + j+"]");
            Matriz[i][j] = sc.nextInt();           
        }
    }    
        int arriba = 0;
        int abajo = d - 1;
        int izquierda = 0;
        int derecha = e - 1;
        
        int indexElementos = 0;
    while (arriba <= abajo && izquierda <= derecha) {
           
            for (int i = izquierda; i <= derecha; i++) {
            Elementos[indexElementos] = Matriz[arriba][i]; 
            indexElementos++;    
            }
            arriba++;

     
            for (int i = arriba; i <= abajo; i++) {
            Elementos[indexElementos] = Matriz[i][derecha];    
            indexElementos++;       
            }
            derecha--; 

 
            if (arriba <= abajo) {
            
            for (int i = derecha; i >= izquierda; i--) {
            Elementos[indexElementos] = Matriz[abajo][i];  
            indexElementos++;      
            }
            abajo--; 
            }

            if (izquierda <= derecha) {
              
            for (int i = abajo; i >= arriba; i--) {
            Elementos[indexElementos] = Matriz[i][izquierda];      
            indexElementos++;      
            }
            izquierda++;   
    }   
    
    }
    for(int i=0; i < Elementos.length;i++){
        System.out.print("["+Elementos[i]+"]");
    }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("1. Recorrer en matriz cuadrada");
        System.out.println("2. Recorrer en matriz rectangular");
        int escoger = sc.nextInt();

        if(escoger == 1 || escoger == 2){
            
        if(escoger == 1){
        System.out.println("Ingresar dimension [d]: ");
        int d = sc.nextInt();
        
        if(d <= 0){
           d = sc.nextInt();;
        } 
        
        EspiralCuadrada(d,d);
        
        }
        
        if(escoger == 2){
        System.out.println("Ingresar filas [n]: ");
        int n = sc.nextInt();
        
        if(n <= 0){
           n = sc.nextInt();;
        }  
        System.out.println("Ingresar columnas [m]: ");
        int m = sc.nextInt();
        
        if(m <= 0){
           m = sc.nextInt();;
        }
        
        EspiralCuadrada(m,n);
        }           
        }

    }
    
}
