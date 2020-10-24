class HeightChecker {
	fun heightChecker(heights: IntArray): Int {
		val targetArray = heights.sortedArray()
		var diffCount = 0
		for(i in heights.indices){
			if(targetArray[i] != heights[i]){
				diffCount+=1
			}
		}
		return diffCount
	}
}

fun main() {
	println(HeightChecker().heightChecker(intArrayOf(1,1,4,2,1,3)))
}
