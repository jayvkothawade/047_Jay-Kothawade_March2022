class Array
{
	public static void main(String args[])
	{
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 3;
		
		for (int i=0; i<arr.length; i++)
		System.out.println("Element at index " + i +" : "+ arr[i]);  
 	}
}