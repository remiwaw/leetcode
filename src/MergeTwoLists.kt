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
			if (currentL1 != null) {
				result?.next = currentL1
				result = result?.next
				currentL1 = currentL1.next
			}
			if (currentL2 != null) {
				result?.next = currentL2
				result = result?.next
				currentL2 = currentL2.next
			}
		}

		return resultHead?.next
	}
}

fun main() {
	val myLinkedList = MyLinkedList()

	myLinkedList.addAtHead(2)
	myLinkedList.deleteAtIndex(1)
	myLinkedList.addAtHead(2)
	myLinkedList.addAtHead(7)
	myLinkedList.addAtHead(3)
	myLinkedList.addAtHead(2)
	myLinkedList.addAtHead(5)
	myLinkedList.addAtTail(5)
	myLinkedList.get(5)
	myLinkedList.deleteAtIndex(6)
	myLinkedList.deleteAtIndex(4)
}


