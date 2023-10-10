/*Scrivi un programma che contiene un metodo che dati 2 interi in ingresso ed un valore di confronto
verifichi se il numero di confronto è compreso tra due valori specifici e stampi il risultato 
dell'operazione comprensivo dei due limiti (inferiore e superiore)*/


public class Main {
    public static void main (String[] args){
    int first = 150;
    int second = 110;
    int checkNum = 110;
    System.out.println("CheckNum " + checkNum +" is between the 2 numbers " + first + " and " + second + "? " + inBetween (first, second, checkNum));
}

static boolean inBetween (int a ,int  b, int c) {
    boolean result = ( (c>=a && c<=b) || (c>=b && c<=a) );
    return result;
    
   

}
}


/*if (a > b) {
        int valHig = a;
        int valLow = b;
    }       else if (b > a){
            int valHig = b;
             int valLow = a;
        }*/
