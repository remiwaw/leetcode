class LinkedListCycle{

	fun hasCycle(head: ListNode?): Boolean {
		if(head?.next == null){
			return false
		}

		var slowPointer = head
		var fastPointer = head

		while (slowPointer!= null && fastPointer?.next != null){
			slowPointer = slowPointer.next
			fastPointer = fastPointer.next?.next

			if(slowPointer == fastPointer){
				return true
			}
		}

		return false
	}
}

class ListNode(var `val`: Int?) {
	   var next: ListNode? = null
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

	println(LinkedListCycle().hasCycle(firstNode))
}
