class RemoveDuplicatesFromSortedArray {
	fun removeDuplicates(nums: IntArray): Int {
		var j = 1

		for(i in 1 until nums.size){
			if(nums[i] != nums[i-1]){
				nums[j] = nums[i]
				j+=1
			}
		}

		return j
	}
}

fun main() {
	println(RemoveDuplicatesFromSortedArray().removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
}
