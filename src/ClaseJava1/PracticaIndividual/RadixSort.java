package ClaseJava1.PracticaIndividual;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RadixSort
{
    public static void main(String[] args)
    {
        int arr[] = {16223,898,13,906,235,23,9,1532,6388,2511,8};
        //int arr[] = {3,673,106,45,2,23};
        //int arr[] = {4,28,132,3,61,5};
        radixSort(arr);

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+(i<arr.length-1?",":""));
        }
    }

    public static void radixSort(int []arr)
    {
        String[] arrStr = StringUtil.toStringArray(arr);

        int max = StringUtil.maxLength(arrStr);

        for (int i = 0; i<max; i++) {

            Map<Integer, ArrayList> hm = new HashMap();
            ArrayList<Integer> arrOrdenado = new ArrayList<>();

            for(int j=0; j<10; j++){
                hm.put(j, new ArrayList<Integer>());
            }

            for(int j=0; j<arr.length; j++){

                int numero = arr[j];

                for(int k=0; k<i; k++){
                    numero /= 10;
                }

                int digito = numero % 10;

                hm.get(digito).add(arr[j]);
            }


            for (Map.Entry<Integer, ArrayList> entry : hm.entrySet()) {

                ArrayList<Integer> arrayListHM = entry.getValue();

                for (int j = 0; j<arrayListHM.size(); j++) {
                    arrOrdenado.add(arrayListHM.get(j));
                }

            }

            for(int k=0; k<arr.length; k++){
               arr[k] = arrOrdenado.get(k);
            }

        }

    }

}