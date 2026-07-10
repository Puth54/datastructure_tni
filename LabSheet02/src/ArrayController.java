
public class ArrayController {
	private int[] nums;
	
	public ArrayController() {
		this.nums  = new int[] {23, 67, 8, 91, 45, 12, 78};
	}
	public void setNums(int[] nums) {
		this.nums  = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public int getSize() {
		return nums.length;
	}
	
	public void display(String message) {
		System.out.println(message);
		boolean first_element = true;
		for (int num : nums) {
			if (first_element == false) {
				System.out.print(",");
			}
			System.out.print(num);
			first_element = false;
		}
	
	}
	
}
