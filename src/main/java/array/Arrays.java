package array;

public class Arrays {
	
	public static void main ( String[] args) {
	
	int [] values = {0,1,2,3,4,5,6,7,8,9};
	for (int i : values) {
		System.out.print(i);
	}
	int[] values2 = new int[10];
	for (int i=0; i<values2.length; i++) {
		values2[i] = i * 2;
		System.out.println(values2[i]);
	}
    for (int i:values2 ) {
    	System.out.println(i*10);
    	
    }
}

	
}
