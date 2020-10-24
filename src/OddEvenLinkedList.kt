class OddEvenLinkedList {
	fun oddEvenList(head: ListNode?): ListNode? {
		var headOdd = head
		var headEven = head?.next
		var counter = 0

		var oddTail: ListNode? = headOdd

		var current = headOdd
		while (current!=null){
			val tempCurrentNext = current.next
			counter+=1
			if(counter%2 == 1){
				val nextTempOdd = current.next?.next
				current.next = nextTempOdd
				oddTail = current
			} else {
				val nextTempEven = current.next?.next
				current.next = nextTempEven
			}

			current = tempCurrentNext
		}

		oddTail?.next = headEven

		return headOdd
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

	println(OddEvenLinkedList().oddEvenList(firstNode))
}
