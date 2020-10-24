class MergeSortedArray {
	fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
		var j = m + n - 1
		var k = m - 1
		var h = n - 1

		while (j >= 0) {
			if (k>=0 && h>=0 && nums1[k] > nums2[h]) {
				nums1[j] = nums1[k]
				k -= 1
			} else if(h>=0){
				nums1[j] = nums2[h]
				h -= 1
			}
			j -= 1
		}
	}
}

fun main() {
	println(MergeSortedArray().merge(intArrayOf(1,2,3,0,0,0), 3, intArrayOf(2,5,6), 3))
}
