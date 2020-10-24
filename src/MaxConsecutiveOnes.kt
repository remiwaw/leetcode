class MaxConsecutiveOnes {
	fun findMaxConsecutiveOnes(nums: IntArray): Int {
		var currentMax = 0
		var max = 0
		nums.forEach {
			if (it != 0){
				currentMax += 1
			} else {
				if(currentMax > max){
					max = currentMax
				}
				currentMax = 0
			}
		}

		if(currentMax > max){
			max = currentMax
		}

		return max
	}
}

fun main() {
	println(MaxConsecutiveOnes().findMaxConsecutiveOnes(intArrayOf(1,1,0,1,1,1)))
}

