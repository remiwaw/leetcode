class IntersectionOfTwoLinkedList {
	fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {

		val firstListTail = getTailWithListSize(headA)
		val secondListTail = getTailWithListSize(headB)

		// If list don't refer to the same tail there is no intersection
		if (firstListTail.first != secondListTail.first) {
			return null
		}

		val longerList = if (firstListTail.second >= secondListTail.second) {
			Pair(headA, firstListTail.second)
		} else {
			Pair(headB, secondListTail.second)
		}

		val shorterList = if (firstListTail.second < secondListTail.second) {
			Pair(headA, firstListTail.second)
		} else {
			Pair(headB, secondListTail.second)
		}

		var lenghtDiff = longerList.second - shorterList.second

		var firstFromLongerListAfterAdjustment = longerList.first
		var firstFromShorterList = shorterList.first

		while (lenghtDiff > 0) {
			firstFromLongerListAfterAdjustment = firstFromLongerListAfterAdjustment?.next
			lenghtDiff -= 1
		}

		while (firstFromLongerListAfterAdjustment != firstFromShorterList) {
			firstFromLongerListAfterAdjustment = firstFromLongerListAfterAdjustment?.next
			firstFromShorterList = firstFromShorterList?.next
		}

		return firstFromShorterList
	}

	private fun getTailWithListSize(head: ListNode?): Pair<ListNode?, Int> {
		var size = if (head != null) {
			1
		} else {
			0
		}
		var currentNode = head
		while (currentNode?.next != null) {
			currentNode = currentNode?.next
			size += 1
		}
		return Pair(currentNode, size)
	}
}

fun main() {
	val firstNode = ListNode(4)
	val secondNode = ListNode(1)
	val thirdNode = ListNode(8)
	val fourthNode = ListNode(4)
	val fifthNode = ListNode(5)
	firstNode.next = secondNode
	secondNode.next = thirdNode
	thirdNode.next = fourthNode
	fourthNode.next = fifthNode
	fifthNode.next = null

	val firstNodeSet2 = ListNode(5)
	val secondNodeSet2 = ListNode(6)
	val thirdNodeSet2 = ListNode(1)
	firstNodeSet2.next = secondNodeSet2
	secondNodeSet2.next = thirdNodeSet2
	thirdNodeSet2.next = thirdNode

	println(IntersectionOfTwoLinkedList().getIntersectionNode(firstNode, firstNodeSet2))
}
