import java.util.List;

public class Workshop {

    public static void main(String[] args) {
        // Método principal
    }

    // --- MÉTODOS MATEMÁTICOS ---

    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n no puede ser negativo");
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public int[] serieFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n no puede ser negativo");
        int[] fib = new int[n]; // Aquí se llama 'fib'
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2]; // Corregido para usar 'fib'
        }
        return fib;
    }

    // --- MÉTODOS DE ARREGLOS ---

    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) suma += num;
        return suma;
    }

    public double promedioElementos(int[] arreglo) {
        if (arreglo.length == 0) return 0;
        return (double) sumaElementos(arreglo) / arreglo.length;
    }

    public int encontrarElementoMayor(int[] arreglo) {
        if (arreglo.length == 0) return 0;
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) mayor = arreglo[i];
        }
        return mayor;
    }

    public int encontrarElementoMenor(int[] arreglo) {
        if (arreglo.length == 0) return 0;
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) menor = arreglo[i];
        }
        return menor;
    }

    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int num : arreglo) {
            if (num == elemento) return true;
        }
        return false;
    }

    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    public int[] ordenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }

    public int[] eliminarDuplicados(int[] arreglo) {
        int[] temp = new int[arreglo.length];
        int count = 0;
        for (int i = 0; i < arreglo.length; i++) {
            boolean existe = false;
            for (int j = 0; j < count; j++) {
                if (arreglo[i] == temp[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) temp[count++] = arreglo[i];
        }
        int[] res = new int[count];
        System.arraycopy(temp, 0, res, 0, count);
        return res;
    }

    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] res = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, res, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, res, arreglo1.length, arreglo2.length);
        return res;
    }

    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        if (n == 0) return arreglo;
        posiciones = (posiciones % n + n) % n; // Maneja posiciones negativas
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arreglo[(i + posiciones) % n];
        }
        return res;
    }

    // --- MÉTODOS DE CADENAS ---

    public int contarCaracteres(String cadena) {
        return (cadena == null) ? 0 : cadena.length();
    }

    public String invertirCadena(String cadena) {
        if (cadena == null) return null;
        return new StringBuilder(cadena).reverse().toString();
    }

    public boolean esPalindromo(String cadena) {
        if (cadena == null) return false;
        String limpia = cadena.replaceAll("\\s+", "").toLowerCase();
        int i = 0, j = limpia.length() - 1;
        while (i < j) {
            if (limpia.charAt(i++) != limpia.charAt(j--)) return false;
        }
        return true;
    }

    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) return 0;
        return cadena.trim().split("\\s+").length;
    }

    public String convertirAMayusculas(String cadena) {
        return (cadena == null) ? null : cadena.toUpperCase();
    }

    public String convertirAMinusculas(String cadena) {
        return (cadena == null) ? null : cadena.toLowerCase();
    }

    public String reemplazarSubcadena(String cadena, String vieja, String nueva) {
        if (cadena == null) return null;
        return cadena.replace(vieja, nueva);
    }

    public int buscarSubcadena(String cadena, String subcadena) {
        if (cadena == null || subcadena == null) return -1;
        return cadena.indexOf(subcadena);
    }

    // --- MÉTODOS ADICIONALES (STUBS) ---

    public boolean validarCorreoElectronico(String correo) {
        return correo != null && correo.contains("@") && correo.contains(".");
    }

    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
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

    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        return "Resultado"; 
    }

    public String pptls2(String[] game) {
        return "Tie";
    }

    public double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public String zoodiac(int day, int month) {
        return "Signo";
    }
}
