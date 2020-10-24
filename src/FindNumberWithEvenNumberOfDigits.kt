class FindNumberWithEvenNumberOfDigits {
	fun findNumbers(nums: IntArray): Int {
		var numberOfEvenDigits = 0
		nums.forEach {
			// isEven
			if(calculateDigitNumber(it) % 2 == 0){
				numberOfEvenDigits++
			}
		}
		return numberOfEvenDigits
	}
}

private fun calculateDigitNumber(number: Int): Int {
	var numberCpy = number
	var digitNumber = 1
	var result = numberCpy/10
	while (result > 0){
		result /= 10
		digitNumber++
	}

	return digitNumber
}

fun main() {
	println(FindNumberWithEvenNumberOfDigits().findNumbers(intArrayOf(12,345,2,6,7896)))
}


