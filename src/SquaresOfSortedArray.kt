import kotlin.math.abs

class SquaresOfSortedArray {
	fun sortedSquares(A: IntArray): IntArray {
		var start = 0
		var end = A.size-1
		var i = end
		val result = IntArray(A.size)

		while(start <= end){
			if(abs(A[start]) > abs(A[end])){
				result[i] = A[start] * A[start]
				start++
				i--
			} else {
				result[i] = A[end] * A[end]
				end--
				i--
			}
		}

		return result
	}
}

fun main() {
	println(SquaresOfSortedArray().sortedSquares(intArrayOf(-4,-1,0,3,10)))
}
