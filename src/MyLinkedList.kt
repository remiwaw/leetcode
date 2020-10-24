class MyLinkedList {

	var head: Node? = null

	/** Initialize your data structure here. */
	class Node(x: Int? = null){
		var next: Node? = null
		var value: Int? = x
	}


	/** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	fun get(index: Int): Int? {
		val node = getNodeAt(index)
		return if(node!=null){
			node.value
		} else {
			-1
		}
	}

	private fun getNodeAt(index: Int): Node? {
		var counter = index
		var currentNode: Node? = head
		while (counter > 0 && currentNode?.next != null) {
			currentNode = currentNode.next
			counter--
		}

		if(counter != 0){
			return null
		}

		return currentNode
	}

	/** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	fun addAtHead(`val`: Int) {
		val newHead = Node(x = `val`)
		newHead.next = head
		head = newHead
	}

	/** Append a node of value val to the last element of the linked list. */
	fun addAtTail(`val`: Int) {
		if(head == null){
			head = Node(x = `val`)
			return
		}
		var lastElement: Node? = head
		while (lastElement?.next != null){
			lastElement = lastElement.next
		}

		lastElement?.next = Node(x = `val`)
	}

	/** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
	fun addAtIndex(index: Int, `val`: Int) {
		if(index == 0){
			addAtHead(`val`)
		} else{
			val itemBefore = getNodeAt(index-1)
			val itemAfter = itemBefore?.next

			val itemToAdd = Node(x = `val`)
			itemToAdd.next = itemAfter
			itemBefore?.next = itemToAdd
		}
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	fun deleteAtIndex(index: Int) {
		if(index==0){
			val next = head?.next
			head = next
		} else {
			val itemBefore = getNodeAt(index-1)
			val itemAfter = itemBefore?.next?.next

			itemBefore?.next = itemAfter
		}
	}
}

fun main() {
	var obj = MyLinkedList()
	obj.addAtTail(1)
	obj.get(0)
}

