public class stuff{
    public int[] frontPiece(int[] nums) {
	int[] result=new int[2];
	if (nums.length>2){
	    for(int x=0; x <2; x++){
		result[x]=nums[x];
	    }
	}
	else
	    return nums;
	return result;
}
    public int sum13(int[] nums) {
	int sum=0;
	int hold;
	if (nums.length==0){
	    return 0;
	}
	else
	    for(hold=0; hold<nums.length;hold++){
		if (nums[hold]<13){
		    sum+=nums[hold];
		}
		if (nums[hold]==13){
		    hold++;
		}
	    }
	return sum;
    }
}
