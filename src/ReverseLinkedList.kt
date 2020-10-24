class ReverseLinkedList {

	fun reverseList(head: ListNode?): ListNode? {
		var previous: ListNode? = null
		var current = head

		while (current != null){
			val nextTemp = current.next
			current.next = previous
			previous = current
			current = nextTemp
		}
		return previous
	}
}

fun main() {
	val firstNode = ListNode(1)
	val secondNode = ListNode(2)
	val thirdNode = ListNode(3)
	val fourthNode = ListNode(4)
	val fifthNode = ListNode(5)
	firstNode.next = secondNode
	secondNode.next = thirdNode
	thirdNode.next = fourthNode
	fourthNode.next = fifthNode
	fifthNode.next = null

	println(ReverseLinkedList().reverseList(firstNode))
}

