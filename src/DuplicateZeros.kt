class DuplicateZeros {
	fun duplicateZeros(arr: IntArray){
		var zeros = 0
		for(number in arr){
			if(number==0){
				zeros+=1
			}
		}

		var i = arr.size-1
		var j = arr.size-1+zeros
		while (i!=j){
			replace(arr, i, j--)
			if(arr[i] == 0){
				replace(arr, i, j--)
			}
			i--
		}
	}

	private fun replace(arr: IntArray, i: Int, j: Int){
		if(j<arr.size){
			arr[j] = arr[i]
		}
	}
}

fun main() {
	println(DuplicateZeros().duplicateZeros(intArrayOf(8,4,5,0,0,0,0,7)))
}
