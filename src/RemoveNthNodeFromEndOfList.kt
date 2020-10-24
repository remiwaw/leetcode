class RemoveNthNodeFromEndOfList {
	fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
		val store = ArrayList<ListNode>(n)
		var size = 0

		var current = head

		if (head != null) {
			store.add(head)
			size += 1
		}

		while (current?.next != null) {
			store.add(requireNotNull(current.next))
			current = current.next
			size += 1
		}

		if (size == 1 && n == 1) {
			return null
		}

		val beforeToBeRemoved = store.getOrNull(size - n - 1)
		val afterToBeRemoved = store.getOrNull(size - n + 1)

		return if (beforeToBeRemoved != null) {
			beforeToBeRemoved.next = afterToBeRemoved
			head
		} else {
			afterToBeRemoved
		}
	}
}

fun main() {
	val firstNode = ListNode(1)
	val secondNode = ListNode(2)
	val thirdNode = ListNode(3)
//	val fourthNode = ListNode(4)
//	val fifthNode = ListNode(5)
	firstNode.next = secondNode
	secondNode.next = thirdNode
//	thirdNode.next = fourthNode
//	fourthNode.next = fifthNode
//	fifthNode.next = null

	println(RemoveNthNodeFromEndOfList().removeNthFromEnd(firstNode, 3))
}

