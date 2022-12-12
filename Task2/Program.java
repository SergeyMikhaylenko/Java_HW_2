//Реализуйте алгоритм сортировки пузырьком числового массива, 
//результат после каждой итерации запишите в лог-файл.

package Task2;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] array = { 9, 4, 7, 3, 5, 7, 3, 5 }; 
        
        int temp; 
        for (int i = array.length - 1; i > 0; i--) { 
            for (int j = 0; j < i; j++) { 
                if (array[j] > array[j + 1]) { 
                    temp = array[j]; 
                    array[j] = array[j + 1]; 
                    array[j + 1] = temp;
                }
            }
        }
       
        System.out.println(Arrays.toString(array)); 
    }
}