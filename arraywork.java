public class arraywork {

	public static void mean() {
		//create array, fill it with whatever
		//creates array type int, length 10
		int[] idk = new int[10];
		idk[0] = 2;
		idk[1] = 9;
		idk[2] = 3;
		idk[3] = 2;
		idk[4] = 2;
		idk[5] = 0;
		idk[6] = 8;
		idk[7] = 5;
		idk[8] = 3;
		idk[9] = 5;

		//for() loop, find sum of array elements
		//var for storing progressive sum
		double sum = 0;
		for(int i = 0; i < idk.length; i++) {
			sum += idk[i];
		}

		//print mean, which is (sum) / (# of elements in array)
		System.out.print("mean: ");
		System.out.println(sum / idk.length);
	}

	public static void range() {
		//just reusing array 'idk' cause i'm lazy
		int[] idk = new int[10];
		idk[0] = 2;
		idk[1] = 9;
		idk[2] = 3;
		idk[3] = 2;
		idk[4] = 2;
		idk[5] = 0;
		idk[6] = 8;
		idk[7] = 5;
		idk[8] = 3;
		idk[9] = 5;

		/*ofc, this is assuming that the array's values are in the
		  range -1000 < x < 1000*/
		//find greatest value in array
		int max = -1000;
		for(int i = 0; i < idk.length; i++) {
			if(idk[i] > max) {
				max = idk[i];
			}
		}

		//find smallest value in array
		int min = 1000;
		for(int i = 0; i < idk.length; i++) {
			if(idk[i] < min) {
				min = idk[i];
			}
		}

		//print range, which is max - min
		System.out.print("range: ");
		System.out.println(max - min);
	}

	public static void main(String[] args) {
		mean();
		range();
	}

}
