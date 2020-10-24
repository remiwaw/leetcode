val nums = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)

class MaximumSubarray {
	fun maxSubArray(nums: IntArray): Int {
		var currentSum = nums[0]
		var maxSum = currentSum
		for (i in 1 until nums.size) {
			currentSum = Math.max(nums[i], currentSum+nums[i])
			maxSum = Math.max(currentSum, maxSum)
		}
		return maxSum
	}
}

fun main() {
	println(MaximumSubarray().maxSubArray(nums))
}

