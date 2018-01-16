/**
 * Write a description of class PruebasConWhile here.
 * 
 * @author (David Rodriguez) 
 * @version (16-01-2018)
 */
public class PruebasConWhile
{
    /**
     * Metodo que muestra por pantalla todos los multiplos de 5
     * comprendidos entre 10 y 95
     */
    public void multiplosDeCinco()
    {
        int index = 10;
        while(index <= 95){
            System.out.println(index);
            index = index + 5;
        }
    }
    
    /**
     * Metodo que suma los valores comprendidos
     * entre 1 y 10
     */
    public void sumaEntreUnoYDiez()
    {
        int index = 1;
        int suma = 0;
        while(index <= 10){
            suma = suma + index;
            index++;
        }
        System.out.println(suma);
    }
    
    /**
     * Suma los numeros comprendidos entre dos numeros a y b
     */
    public void sum(int a, int b)
    {
        int suma = 0;
        while(a <= b){
            suma = suma + a;
            a++;
        }
        System.out.println(suma);
    }
    
    /**
     * Calcula si el numero introducido es primo
     */
    public boolean isPrime(int n)
    {
        boolean esPrimo = true;
        int index = 2;
        while(index < n && esPrimo){
            if(n % index == 0){
                esPrimo = false;
            }
            index++;
        }
        return esPrimo;
    }
}

