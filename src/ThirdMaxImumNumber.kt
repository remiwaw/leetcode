class ThirdMaxImumNumber {
	fun thirdMax(nums: IntArray): Int {
		var firstMax: Int? = null
		var secondMax: Int? = null
		var thirdMax: Int? = null


		for (value in nums) {
			if(value == firstMax || value == secondMax || value == thirdMax){
				continue
			}

			if(firstMax == null || value>firstMax){
				thirdMax = secondMax
				secondMax = firstMax
				firstMax = value
			} else if(secondMax == null || value>secondMax){
				thirdMax = secondMax
				secondMax = value
			} else if(thirdMax == null || value>thirdMax){
				thirdMax = value
			}
		}

		return thirdMax ?: requireNotNull(firstMax)
	}
}

fun main() {
	println(ThirdMaxImumNumber().thirdMax(intArrayOf(1,2)))
}

