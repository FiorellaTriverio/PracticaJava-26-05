package ClaseJava1.PracticaIndividual;

public class StringUtil
{
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c,int n)
    {
        String retorno = "";

        for(int i=0; i<n; i++){
            retorno += c;
        }

        return retorno;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c)
    {
        String extra = "";

        extra = replicate('0', n);

        return extra+s;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[])
    {
        String[] arrayStr = new String[arr.length];

        for(int i=0; i<arrayStr.length; i++){
            arrayStr[i] = String.valueOf(arr[i]);
        }

        lNormalize(arrayStr, '0');

        return arrayStr;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[])
    {
        int[] arrayInt = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            arrayInt[i] = Integer.valueOf(arr[i]);
        }

        return arrayInt;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[])
    {
        int max = arr[0].length();

        for(int i=0; i<arr.length; i++){
            if(arr[i].length() > max){
                max = arr[i].length();
            }
        }

        return max;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c)
    {
        int max = maxLength(arr);

        for(int i=0; i<arr.length; i++){

            if(arr[i].length() < max){
                int dif = max - arr[i].length();
                arr[i] = lpad(arr[i], dif, c);
            }

        }

    }



}