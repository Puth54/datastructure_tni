
public class Ex04 {

	public static void main(String[] args) {
		ArrayController nums = new ArrayController();
		nums.display("All elements: ");
		
		int[] new_nums = new int[nums.getSize()-1];
		
		//copy data from nums -> new_nums by delete index 0
		for (int i=0; i<new_nums.length; i++) {
			new_nums[i] = nums.getNums()[i+1];
		}
		
		
		//display
		nums.setNums(new_nums);
		nums.display("\n\nAfter deleted the first index");
		
		

	}

}
