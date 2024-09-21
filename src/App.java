public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Crear una instancia de la clase Repaso.
         * 
         * Una 'instancia' es un objeto concreto creado a partir de una clase.
         * En este caso, estamos creando un nuevo objeto llamado 'dataStructuresPrep' a
         * partir
         * de la clase 'Repaso'. Cada instancia de una clase tiene sus propios
         * atributos y métodos, lo que significa que podemos usar 'dataStructuresPrep'
         * para
         * acceder a los métodos definidos dentro de la clase 'Repaso'.
         */
        DataStructuresPrep dataStructuresPrep = new DataStructuresPrep();

        /*
         * Usar la instancia 'dataStructuresPrep' para llamar al método
         * 'subtractWithoutSubtracting'.
         * 
         * Ahora que tenemos una instancia de 'Repaso', podemos usarla para llamar a sus
         * métodos.
         * Aquí, llamamos al método 'subtractWithoutSubtracting', pasando 15 y 5 como
         * argumentos.
         * Este método está diseñado para restar el segundo número del primero sin usar
         * el
         * operador de resta tradicional. Es un buen ejercicio para entender cómo
         * podemos
         * realizar operaciones básicas de manera creativa en programación.
         */
        int resultado = dataStructuresPrep.subtractAlgorithm(12,5);
        int resultao = dataStructuresPrep.multiplyAlgorithm(3,5);
        int resultadoDiv = dataStructuresPrep.divideWAlgorithm(20,5);
        boolean resperfect = dataStructuresPrep.isPerfectNumber(28);
        int resfact = dataStructuresPrep.getFactorial(5);
        int resmax = dataStructuresPrep.findMaximum(new int[]{1, 5, 3, 6, 8, 2});
        int respower = dataStructuresPrep.powerAlgorithm(2,4);
        boolean resprime = dataStructuresPrep.isPrime(13);
        int resdigit = dataStructuresPrep.countDigits(3546747);
        /*
         * 
         * Imprimir el resultado de la operación.
         * 
         * Finalmente, imprimimos el resultado de la operación a la consola. Esto nos
         * permite
         * ver el resultado de nuestro método 'subtractWithoutSubtracting'. En este
         * ejemplo,
         * estamos esperando que el resultado sea 10, ya que 15 menos 5 es igual a 10.
         * Esta línea demuestra cómo podemos interactuar con los métodos de nuestras
         * instancias
         * y usar los resultados de sus operaciones en otras partes de nuestro código,
         * como
         * parte de mensajes de salida o en lógicas de decisión más complejas.
         */
        System.out.println("El resultado de subtractAlgorithm  es: " + resultado);
        System.out.println("El resultado de multiplyAlgorithm  es: " + resultao);
        System.out.println("El resultado de divideWAlgoritm es: " + resultadoDiv);
        System.out.println("El resultado de isPerfectNUmber es: " + resperfect);
        System.out.println("El resultado de getFactorial es: " + resfact);
        System.out.println("El resultado de findMaximum es: " + resmax);
        System.out.println("El resultado de powerAlgorithm es: " + respower);
        System.out.println("El resultado de isPrime es: " + resprime);
        System.out.println("El resultado de coutDigits es: " + resdigit);

    }
}
