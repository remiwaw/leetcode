import java.lang.Integer.max

class ReplaceElementsWithGreatersOnLeftSide3259 {
	fun replaceElements(arr: IntArray): IntArray {
		var rightMax = -1
		var newMax: Int
		for (i in arr.size-1 downTo 0){
			newMax = max(rightMax, arr[i])
			arr[i] = rightMax
			rightMax = newMax
		}

		return arr
	}
}



fun main() {
	println(ReplaceElementsWithGreatersOnLeftSide3259().replaceElements(intArrayOf(17,18,5,4,6,1)))
}
