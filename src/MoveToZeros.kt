import kotlin.math.ln

//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]

class MoveToZeros {
	fun moveZeroes(nums: IntArray): IntArray {
		for(i in nums.indices){
			if(nums[i] == 0){
				var nonZeroIndex = -1
				if(i+1 < nums.size){
					for(j in i+1 until nums.size){
						if(nums[j] != 0){
							nonZeroIndex = j
							break
						}
					}
				}

				if(nonZeroIndex != -1){
					val temp = nums[nonZeroIndex]
					nums[nonZeroIndex] = nums[i]
					nums[i] = temp
				}

			}
		}

		return nums
	}
}

fun main() {
	MoveToZeros().moveZeroes(intArrayOf(0,1,0,3,12)).forEach { println(it) }
}

