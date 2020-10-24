import java.lang.Math.abs

class FindAllNumberDisappearedInArray {
	fun findDisappearedNumbers(nums: IntArray): List<Int> {
		val notPresentList = mutableListOf<Int>()
		for(i in nums.indices){
			var current = abs(nums[i])
			nums[current-1] = -abs(nums[current-1])
		}

		for(i in nums.indices){
			if(nums[i]>0){
				notPresentList.add(i+1) // i+1 because we substracted 1 before
			}
		}

		return notPresentList
	}
}

fun main() {
	println(FindAllNumberDisappearedInArray().findDisappearedNumbers(intArrayOf(4,3,2,7,8,2,3,1)))
}
