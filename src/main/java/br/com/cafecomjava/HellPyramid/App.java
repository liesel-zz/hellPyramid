package br.com.cafecomjava.HellPyramid;

public class App 
{

	public static void main( String[] args )
	{
		int [][] pyramid = {{6},{3,5},{9,7,1},{4,6,8,4}};
		App app = new App();
		System.out.println(app.hellPyramid(pyramid));
	}

	/***
	 * 
	 * @param pyramid
	 * @return the sum of all biggest numbers on each line respecting the rule of e nearest ones.
	 */
	public long hellPyramid(int [][] pyramid){
		int [] tmp 	= getBiggesInLine(pyramid[0], 0);
		int sum 		= tmp[0];
		int position 	= tmp[1];
		int length = pyramid.length;
		for (int i = 1; i < length; i++) {
			int [] result 	= getBiggesInLine(pyramid[i], position);
			sum 		= sum+result[0];
			position 	= result[1];
		}
		return sum;
	}
	/***
	 * @param numbers
	 * @param position
	 * @return the biggest number and its position on array
	 */
	public int [] getBiggesInLine(int [] numbers, int position){
		int [] result = {numbers[position], position};
		if (numbers.length == 1)
			return result;
		if (numbers[position] < numbers[position+1]) {
			result[0] = numbers[position+1];
			result[1] = position+1;
		}

		return result;
	}



}
