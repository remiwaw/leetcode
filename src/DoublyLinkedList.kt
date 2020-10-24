class DoublyLinkedList(var head: DoubleNode? = null, var tail: DoubleNode? = null, var length: Int = 0) {

	class DoubleNode(var `val`: Int, var previous: DoubleNode? = null, var next: DoubleNode? = null)

	/** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	fun get(index: Int): Int? {
		return if (index < 0 || index >= this.length) {
			-1
		} else {
			val node = getNodeAt(index)
			node?.`val` ?: -1
		}
	}

	private fun getNodeAt(index: Int): DoubleNode? {
		var counter = 0
		var current: DoubleNode? = head
		while (counter != index) {
			current = current?.next
			counter += 1
		}

		return current
	}

	/** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	fun addAtHead(`val`: Int) {
		val newNode = DoubleNode(`val` = `val`)
		this.head?.previous = newNode
		newNode.next = this.head
		this.head = newNode
		if(newNode.next == null){
			tail = head
		}
		this.length++
	}

	/** Append a node of value val to the last element of the linked list. */
	fun addAtTail(`val`: Int) {
		val currentTail = tail
		if(currentTail == null){
			addAtHead(`val`)
			return
		}
		val newTail = DoubleNode(`val`, previous = currentTail, next = null)
		currentTail.next = newTail
		tail = newTail
		this.length++
	}

	/** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
	fun addAtIndex(index: Int, `val`: Int) {
		if(index > length){
			return
		}
		if(index == 0){
			addAtHead(`val`)
			return
		}
		if(index == length){
			addAtTail(`val`)
			return
		}
		val newNode = DoubleNode(`val`)
		val currentNodeAtThisIndex = getNodeAt(index)
		newNode.previous = currentNodeAtThisIndex?.previous
		newNode.next = currentNodeAtThisIndex
		currentNodeAtThisIndex?.previous?.next = newNode
		currentNodeAtThisIndex?.previous = newNode
		this.length+=1
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	fun deleteAtIndex(index: Int) {
		if(index>=length){
			return
		}

		if(index == 0){
			head = head?.next
			return
		}

		val isLastElement = index + 1 == length
		if(isLastElement){
			tail = tail?.previous
		}

		val itemToRemove = getNodeAt(index)
		val previousItem = itemToRemove?.previous
		val nextItem = itemToRemove?.next

		previousItem?.next = nextItem
		nextItem?.previous = previousItem
		this.length-=1
	}
}

fun main() {
	val myLinkedList = DoublyLinkedList()

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


