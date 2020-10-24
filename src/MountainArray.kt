class MountainArray {
	fun validMountainArray(A: IntArray): Boolean {
		val n = A.size
		var i = 0

		while (i+1 < n && A[i]<A[i+1])
			i++

		if(i == 0 || i == n-1){
			return false
		}

		while (i+1<n && A[i] > A[i+1]){
			i++;
		}

		return i == n-1
	}
}

fun main() {
	println(MountainArray().validMountainArray(intArrayOf(0,3,2,1)))
}
