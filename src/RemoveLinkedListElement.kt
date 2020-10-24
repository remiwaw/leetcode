class RemoveLinkedListElement {
	fun removeElements(head: ListNode?, `val`: Int): ListNode? {
		val headCopy = ListNode(Int.MIN_VALUE)
		headCopy.next = head

		var current = headCopy.next
		var previous: ListNode = headCopy
		while (current!=null){
			val tempNext = current.next
			if(current.`val` == `val`){
				previous.next = tempNext
			} else {
				previous = current
			}
			current = tempNext
		}

		return headCopy.next
	}
}

fun main() {
	val firstNode = ListNode(1)
	val secondNode = ListNode(2)
	val thirdNode = ListNode(2)
	val fourthNode = ListNode(1)
	val fifthNode = ListNode(1)
	firstNode.next = secondNode
	secondNode.next = thirdNode
	thirdNode.next = fourthNode
	fourthNode.next = fifthNode
	fifthNode.next = null

	println(RemoveLinkedListElement().removeElements(firstNode, 1))
}
