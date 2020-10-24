class MergeTwoLists {
	fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {

		var result: ListNode? = ListNode(-1)
		var resultHead: ListNode? = result

		if (l1 == null && l2 == null) {
			return null
		}
		if (l1 != null && l2 == null) {
			return l1
		}
		if (l1 == null && l2 != null) {
			return l2
		}

		var currentL1 = l1
		var currentL2 = l2
		while (currentL1 != null || currentL2 != null) {

			if (currentL1?.`val` ?: Int.MAX_VALUE < currentL2?.`val` ?: Int.MAX_VALUE) {
				result?.next = currentL1?.`val`?.let { ListNode(it) }
				currentL1 = currentL1?.next
			} else {
				result?.next = currentL2?.`val`?.let { ListNode(it) }
				currentL2 = currentL2?.next
			}

			result = result?.next
		}

		return resultHead?.next
	}
}

fun main() {
	val a1 = ListNode(1)
	val a2 = ListNode(2)
	val a3 = ListNode(4)
	a1.next = a2
	a2.next = a3

	val b1 = ListNode(1)
	val b2 = ListNode(3)
	val b3 = ListNode(4)
	b1.next = b2
	b2.next = b3

	val result = MergeTwoLists().mergeTwoLists(a1,b1)
}


