class LinkedListCycle2{

	fun detectCycle(head: ListNode?): ListNode? {

		var intersection: ListNode? = findIntersection(head) ?: return null

		var start = head;

		while (intersection != start){
			intersection = intersection?.next
			start = start?.next
		}

		return start
	}


	private fun findIntersection(head: ListNode?): ListNode? {

		if(head?.next == null){
			return null
		}

		var slow = head
		var fast  = head

		while (slow != null && fast?.next != null){
			slow = slow.next
			fast = fast.next?.next

			if(slow == fast){
				return slow
			}
		}

		return null
	}
}

fun main() {
	val firstNode = ListNode(3)
	val secondNode = ListNode(2)
	val thirdNode = ListNode(0)
	val fourthNode = ListNode(-4)
	fourthNode.next = secondNode
	thirdNode.next = fourthNode
	secondNode.next = thirdNode
	firstNode.next = secondNode

	println(LinkedListCycle2().detectCycle(firstNode))
}
