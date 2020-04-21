
/**
 * Realiza un programa que realice la siguiente serie. Solo debes tener un solo método que 
 * retorne un String con la serie solicitada y su parámetro sea un número entero positivo.  
  * Si el número no es positivo, solo retorna el número. Entrada: 22 Salida: 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
 * 
**/

public class Ejercicio_1{

    public static void main(String args[]){//Clase de prueba
        int entrada = Integer.parseInt(args[0]);//Una conversión de datos de string a entero 
        System.out.println("Entrada: "+entrada);
        System.out.println("Salida: "+serieN(entrada));
    }
    
    public static String serieN(int num){//El metodo recibe un parametro de tipo entero y retorna un string
        String serie= Integer.toString(num);//Esta es una de las formas de convertir un numero 
        if(num <= 0){//el if determina que si el numero es 0 o menor a 0 retorna el mismo nuemro
            serie = Integer.toString(num);//Aquí convertimos el numero entero en un string, esta es una forma de convertir un valor de tipo entero a un string
            return serie;//Se retorma el valor en forma de un string
        }else{//Se accede cuando el numero es mayor a 0, positivo
            while(num > 1){//El while termina cuando el numero sea 1
                if(num%2 == 0){//El if tiene la condicion de comprobar si un numero es divisible entre 2
                    num /= 2;//se realiza la operación de dividir entre de dos y reasignar el valor a la variable num
                }else{//de no ser divisible entre 2
                    num = (num*3)+1;//se multiplica el valor que tenga num por 3 y se le suma 1, para posteriormente reasignar un valor a la variable num
                }
                serie += " " + num;//Aquí se presenta una forma alternativa de la conversión de un valor de tipo entero a un string(Quise hacer uso de dos formas distintas). Ademas de que se van concatenando en en string serie todos los numeros que van saliendo
            }
        }
         return serie;//retorno de la variable serie de tipo String como indica el metodo
    }
    
    
}