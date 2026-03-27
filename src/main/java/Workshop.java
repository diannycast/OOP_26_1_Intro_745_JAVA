import java.util.List;

public class Workshop {
    public static void main(String[] args) {
        // Aquí puedes probar tus métodos
    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a + b; // Agregado ;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) { // Corregido el bucle y la variable i
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    // Método que calcula el factorial de un número entero
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n no puede ser negativo");
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n no puede ser negativo");
        int[] fibonacci = new int[n];
        if (n > 0) fibonacci[0] = 0;
        if (n > 1) fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        if (arreglo.length == 0) return 0;
        int suma = sumaElementos(arreglo);
        return (double) suma / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) mayor = arreglo[i];
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) { // Corregida la lógica del for
            if (arreglo[i] < menor) menor = arreglo[i];
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int x : arreglo) {
            if (x == elemento) return true;
        }
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length]; // Corregido length
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente (Bubble Sort)
    public int[] ordenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) { // Faltaban llaves aquí
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        int[] temp = new int[arreglo.length];
        int count = 0;
        for (int i = 0; i < arreglo.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < count; j++) {
                if (arreglo[i] == temp[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                temp[count++] = arreglo[i];
            }
        }
        int[] resultado = new int[count];
        System.arraycopy(temp, 0, resultado, 0, count);
        return resultado;
    }

    // Método que combina dos arreglos
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] resultado = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, resultado, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, resultado, arreglo1.length, arreglo2.length);
        return resultado;
    }

    // Método que rota un arreglo
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        if (n == 0) return arreglo;
        posiciones = posiciones % n;
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = arreglo[(i + posiciones) % n];
        }
        return resultado;
    }

    // Métodos de Cadenas
    public int contarCaracteres(String cadena) {
        return cadena.length(); // Corregido spelling y simplificado
    }

    public String invertirCadena(String cadena) { // Quitada la palabra 'javapublic'
        String resultado = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }
        return resultado;
    }

    public boolean esPalindromo(String cadena) {
        int izquierda = 0;
        int derecha = cadena.length() - 1;
        while (izquierda < derecha) {
            if (cadena.charAt(izquierda) != cadena.charAt(derecha)) return false;
            izquierda++;
            derecha--;
        }
        return true;
    }

    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) return 0;
        return cadena.trim().split("\\s+").length; // Versión más corta y efectiva
    }

    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    public String reemplazarSubcadena(String cadena, String antigua, String nueva) {
        return cadena.replace(antigua, nueva);
    }

    // Tareas pendientes (Stubs)
    public int buscarSubcadena(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    public boolean validarCorreoElectronico(String correo) {
        return correo.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public double promedioLista(List<Integer> lista) {
        if (lista.isEmpty()) return 0.0;
        double suma = 0;
        for (int n : lista) suma += n;
        return suma / lista.size();
    }

    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    public double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
