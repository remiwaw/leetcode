class PalindromeLinkedList {
	fun isPalindrome(head: ListNode?): Boolean {
		val size = size(head)
		val secondPartIndex = getSecondPartIndex(size)
		val secondPartHead = scrollTo(secondPartIndex, head)

		var currentFirstPart = head
		var currentSecondPart = reverse(secondPartHead)

		while (currentSecondPart!=null){
			if(currentFirstPart?.`val` != currentSecondPart.`val`){
				return false
			}
			currentFirstPart = currentFirstPart?.next
			currentSecondPart = currentSecondPart.next
		}

		return true
	}

	private fun getSecondPartIndex(size: Int): Int {
		return if(size % 2==1){
			size/2+2
		} else{
			size/2+1
		}
	}

	private fun scrollTo(index: Int, head: ListNode?): ListNode? {
		var counter = 1
		var current = head
		while (counter != index){
			current = current?.next
			counter++
		}

		return current
	}

	private fun size(head: ListNode?): Int {
		var current = head
		var size = 0
		while (current!=null){
			size+=1
			current = current.next
		}

		return size
	}
	private fun reverse(head: ListNode?): ListNode? {
		var previous : ListNode? = null
		var current = head
		while (current!=null){
			val tempNext = current.next
			current.next = previous
			previous = current
			current = tempNext
		}

		return previous
	}
}

fun main() {
	val firstNode = ListNode(1)
	val secondNode = ListNode(2)
	firstNode.next = secondNode

	println(PalindromeLinkedList().isPalindrome(firstNode))
}
