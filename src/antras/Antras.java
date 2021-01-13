package antras;

public class Antras {

   public static void main(String[] args) {

       int [] masyvas = {15, 42, 15, 98, -2, -47, 10, 3, -14, 36};
       //surusiuoti didejimo tvarka
       
       int n = masyvas.length;
       int temp = 0;
       for (int i = 0; i < n; i++) 
           for (int j = 1; j < (n-i); j++) {
               if(masyvas[j-1] > masyvas[j]){
                   //swap elements
                   temp = masyvas[j-1];
                   masyvas[j-1] = masyvas[j];
                   masyvas[j] = temp;
               }
           }
       
       for (int i = 0; i < masyvas.length; i++) { //atspausdina visus elementus
         System.out.print(masyvas[i] + " ");  
       }
       System.out.println("");
       
       //surusiuoti maziejimo tvarka
       
       
       int tempo = 0;
       for (int i = 0; i < n; i++) 
           for (int j = 1; j < (n-i); j++) {
               if(masyvas[j-1] < masyvas[j]){
                   //swap elements
                   tempo = masyvas[j-1];
                   masyvas[j-1] = masyvas[j];
                   masyvas[j] = tempo;
               }
           }
       
       for (int i = 0; i < masyvas.length; i++) { //atspausdina visus elementus
         System.out.print(masyvas[i] + " ");  
       }
       
       
//       for (int i = 0; i < masyvas.length; i++) {
//           System.out.println(masyvas[i]);
//       }
    
       
       //KLASEJE
       
       
//       int m;
//       int[] masinos = new int[8]; //masyvas is 8 sveikuju skaiciu
//       int [] suReiksmem = {12, -1, 47};
////       int [] suReiksmem = new int[3];
////       suReiksmem[0] = 12;
////       suReiksmem[1] = -1;
////       suReiksmem[2] = 47;
//       
//       
//       masinos[0] = 15;
//       
//       System.out.println(masinos[0]);
    }
    
}
