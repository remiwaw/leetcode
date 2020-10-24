val testNumbers = intArrayOf(3,2,2,3)
val testValToRemove = 3

class RemoveElement {
	fun removeElement(nums: IntArray, `val`: Int): Int {
		var i = 0
		for (j in nums.indices) {
			if (nums[j] != `val`) {
				nums[i] = nums[j]
				i++
			}
		}
		return i
	}
}

fun main() {
	println(RemoveElement().removeElement(testNumbers, testValToRemove))
}

