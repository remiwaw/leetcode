class SortArrayByParity {
	fun sortArrayByParity(A: IntArray): IntArray {
		var j = 0
		for (i in A.indices){
			if(A[i] % 2 == 0){
				swap(A, i, j)
				j++
			}
		}

		return A
	}

	private fun swap(A: IntArray, i: Int, j: Int){
		val temp = A[i]
		A[i] = A[j]
		A[j] = temp
	}
}

fun main() {
	println(SortArrayByParity().sortArrayByParity(intArrayOf(3,1,2,4)))
}
