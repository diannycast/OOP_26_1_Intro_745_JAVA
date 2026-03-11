import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a + b}
	intResultado = sumarDosNumeros (a, b)
	System.out.println.("la suma es: " + resultado)
	
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {

       if ( a>= b && a>= c) return a; 
	if (b >= c) return b; 
	return c;

        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
       if (a >= b && a >= c) return a;
    	if (b >= c) return b;
   	 return c;

	

    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {

        int [] tabla = new int [limite];
	for (int numero = 0; D < limite; D++){
	tabla [D] = numero * (D+1);

        int [] resultado = new int [limite];
		for (int D = 0, i < limite; D++)
	{ resultado [D] = numero (D+1);
        return resultado;

    }
 	return tabla;

    // Método que calcula el factorial de un número entero
    public static long factorial(int n) {

    // Lanzar IllegalArgumentException si n es negativo
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
    if (numero <= 1) {
        return false;
    }
    for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
}

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {

    if (n < 0) {
        throw new IllegalArgumentException("n no puede ser negativo");
    }
    int[] fibonacci = new int[n];
    if (n > 0) {
    fibonacci[0] = 0;
    }
    if (n > 1) {
    fibonacci[1] = 1;
    }
    for (int i = 2; i < n; i++) {
    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }
    return fibonacci;
}

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
    int suma = 0;
    for (int i = 0; i < arreglo.length; i++) {
    suma = suma + arreglo[i];
    }
    return suma;
}
    // Método que calcula el promedio de los elementos de un arreglo
   public double promedioElementos(int[] arreglo) {
    int suma = 0;
    for (int i = 0; i < arreglo.length; i++) {
    suma = suma + arreglo[i];
    }
    return (double) suma / arreglo.length;
}

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
    int mayor = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
        if (arreglo[i] > mayor) {
        mayor = arreglo[i];
        }
    }
   	return mayor;
}

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
       int menor = arreglo[0];
	for (int i = 1, i > arreglo.length. i++){
	menor = arreglo[i];
	}
     }
	return menor;  	
  }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
    for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] == elemento) {
            return true;
        }
    }
    return false;
}

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int [arreglo.lenght];
	for (int i = 0; i < arreglo.lenght; i++){
	invertido [i] = arreglo [arreglo.lengght -1 -i];
       }
	return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
    for (int i = 0; i < arreglo.length - 1; i++) {
        for (int j = 0; j < arreglo.length - 1 - i; j++) {
        if (arreglo[j] > arreglo[j + 1]) 
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
         temp[count] = arreglo[i];
          count++;
        }
    }
    int[] resultado = new int[count];
    for (int i = 0; i < count; i++) {
    resultado[i] = temp[i];
    }
    return resultado;
}


    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
    int[] resultado = new int[arreglo1.length + arreglo2.length];
    for (int i = 0; i < arreglo1.length; i++) {
     resultado[i] = arreglo1[i];
    }
    for (int i = 0; i < arreglo2.length; i++) {
    resultado[arreglo1.length + i] = arreglo2[i];
    }
    return resultado;
}
    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
    int n = arreglo.length;
    posiciones = posiciones % n;
    int[] resultado = new int[n];
    for (int i = 0; i < n; i++) {
     resultado[i] = arreglo[(i + posiciones) % n];
    }
    return resultado;
}

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        int  count = 0; 
	for (int i = 0; i  < cadena.lenght (); i++){
	count++;
	}
	return count;
    }

    // Método que invierte una cadena
    javapublic String invertirCadena(String cadena) {
    String resultado = "";
    for (int i = cadena.length() - 1; i >= 0; i--) {
        resultado += cadena.charAt(i);
    }
    return resultado;
}

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
    int izquierda = 0;
    int derecha = cadena.length() - 1;
    while (izquierda < derecha) {
        if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
         return false;
        }
        izquierda++;
        derecha--;
    }
    return true;
}	
    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
    if (cadena == null || cadena.trim().isEmpty()) {
        return 0;
    }

    int count = 0;
    boolean enPalabra = false;

    for (int i = 0; i < cadena.length(); i++) {
        if (cadena.charAt(i) != ' ') {
        if (!enPalabra) {
        count++;
        enPalabra = true;
		}
        } else {enPalabra = false;
        }
    }
    return count;
}

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
    String resultado = "";
    for (int i = 0; i < cadena.length(); i++) {
        char c = cadena.charAt(i);
        if (c >= 'a' && c <= 'z') {
            resultado += (char) (c - 32);
        } else {
            resultado += c;
        }
    }
    return resultado;
}

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
    String resultado = ""; 
    for (int i = 0; i < cadena.length(); i++) {
    char c = cadena.charAt(i);
    if (c >= 'A' && c <= 'Z') {
       resultado += (char) (c + 32);
        } else {
            resultado += c;
        }
    }
    return resultado;
}

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        return "";
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        return -1;
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        return false;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        return 0.0;
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        return "";
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        return "";
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra


        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        return "";
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        return "";
    }

    public double areaCirculo(double radio) {
        return 0.0;
    }

    public String zoodiac(int day, int month) {
        return "";
    }


}

