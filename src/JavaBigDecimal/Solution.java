/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBigDecimal;

import java.math.BigDecimal;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        int[] c = new int[s.length - 2];
        int[] d = new int[s.length - 2];
        BigDecimal []nums = new BigDecimal[s.length - 2];
        
        
     
        
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        
        Arrays.sort(s, new Comparator<String>() {
	    @Override
	    public int compare(String o1, String o2) {
		if (o1 == null || o2 == null) {
		    return 0;
		}
		BigDecimal o1bd = new BigDecimal(o1);
		BigDecimal o2bd = new BigDecimal(o2);
		return o2bd.compareTo(o1bd);
	    }
	});
           
           
        sc.close();

        
        /* creo un arreglo de integers ya que vienen en String y  */
        for (int j = 0; j < c.length; j++) {
            if (s[j] != null) {
                c[j] = Math.abs(Integer.parseInt(s[j]));
            }
        }

        /* Recorrro el nuevo arreglo creado de integers */
        for (int i = 0; i < c.length; i++) {
            // System.out.println("nuevo arreglo integer"+" " + c[i]);
        }

        /* ordeno el arreglo */
        d = optimizedBubbleSort(c);

        /* recorro el arreglo ordenado*/
        for (int i = 0; i < d.length; i++) {
            //System.out.println("arreglo ordenado" + " " + d[i]);
        }

        s = new String[n + 2];
        /* igual arreglos */
        for (int i = 0; i < d.length; i++) {
            nums[i]= new BigDecimal(d[i]);
        }

        
        for (BigDecimal num : nums) {
          //  System.out.println("Bigs "+ num);
        }
        
        for (int i = 0; i < n; i++) {
            
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

    public static int[] optimizedBubbleSort(int[] arr) {
        int i = 0, n = arr.length;
        boolean swapNeeded = true;
        int sWaps = 0;
        while (i < n - 1 && swapNeeded) {
            swapNeeded = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    sWaps++;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded) {
                break;
            }
            i++;
        }

        return arr;
    }
}
