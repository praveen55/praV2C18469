
public class Maxmin {

	public static void main(String[] args) {
		int arr[] = {20,40,50,2,8,48,57};
		int max =arr[0];
		int min =arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max< arr[i])
			{
				max =arr[i];
			}
			else if(min >arr[i])
			{
				min =arr[i];
			}
		}
		System.out.println("Maximum =" + max + "\nMinimum =" + min);
	}
}
