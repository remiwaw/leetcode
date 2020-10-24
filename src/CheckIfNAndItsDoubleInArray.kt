class CheckIfNAndItsDoubleInArray {
	fun checkIfExist(arr: IntArray): Boolean {
		for(i in arr.indices){
			for (j in i+1 until arr.size){
				if(arr[j] * 2 == arr[i] || (arr[j] % 2 == 0 && arr[j] / 2 == arr[i])){
					return true
				}
			}
		}

		return false
	}
}

fun main() {
	println(CheckIfNAndItsDoubleInArray().checkIfExist(intArrayOf(2,10,5,4)))
}
