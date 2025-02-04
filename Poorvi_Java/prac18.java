import java.util.Arrays;

public class prac18 {
public static void main(String[] args) {
if (args.length == 0) {
System.out.println("Usage: java SortIntArray <size_of_array> <element1> <element2> ...");
return;
}


int size = Integer.parseInt(args[0]);   
 if (args.length != size + 1) {
System.out.println("Number of elements does not match the specified size of the array.");
 return;
}

int[] array = new int[size];
for (int i = 0; i < size; i++) {
array[i] = Integer.parseInt(args[i + 1]);
}
Arrays.sort(array);
System.out.println("Sorted Array:");
for (int num : array) {
System.out.print(num + " ");
}
}
}
