#include <iostream>

using namespace std;

struct Node {
	int data;
	Node* next;
};

// only for the 1st Node
void initNode(struct Node *head, int n) {
	head->data = n;
	head->next = NULL;
}

// apending
void addNode(struct Node *head, int n) {
	Node *newNode = new Node;
	newNode->data = n;
	newNode->next = NULL;

	Node *cur = head;
	while (cur) {
		if (cur->next == NULL) {
			cur->next = newNode;
			return;
		}
		cur = cur->next;
	}
}

void insertFront(struct Node **head, int n) {
	Node *newNode = new Node;
	newNode->data = n;
	newNode->next = *head;
	*head = newNode;
}

struct Node *searchNode(struct Node *head, int n) {
	Node *cur = head;
	while (cur) {
		if (cur->data == n) return cur;
		cur = cur->next;
	}
	cout << "No Node " << n << " in list.\n";
}

bool deleteNode(struct Node **head, Node *ptrDel) {
	Node *cur = *head;
	if (ptrDel == *head) {
		*head = cur->next;
		delete ptrDel;
		return true;
	}

	while (cur) {
		if (cur->next == ptrDel) {
			cur->next = ptrDel->next;
			delete ptrDel;
			return true;
		}
		cur = cur->next;
	}
	return false;
}

/* reverse the list */
struct Node* reverse(struct Node** head)
{
	Node *parent = *head;
	Node *me = parent->next;
	Node *child = me->next;

	/* make parent as tail */
	parent->next = NULL;
	while (child) {
		me->next = parent;
		parent = me;
		me = child;
		child = child->next;
	}
	me->next = parent;
	*head = me;
	return *head;
}

/* Creating a copy of a linked list */
void copyLinkedList(struct Node *node, struct Node **pNew)
{
	if (node != NULL) {
		*pNew = new Node;
		(*pNew)->data = node->data;
		(*pNew)->next = NULL;
		copyLinkedList(node->next, &((*pNew)->next));
	}
}

/* Compare two linked list */
/* return value: same(1), different(0) */
int compareLinkedList(struct Node *node1, struct Node *node2)
{
	static int flag;

	/* both lists are NULL */
	if (node1 == NULL && node2 == NULL) {
		flag = 1;
	}
	else {
		if (node1 == NULL || node2 == NULL)
			flag = 0;
		else if (node1->data != node2->data)
			flag = 0;
		else
			compareLinkedList(node1->next, node2->next);
	}

	return flag;
}

void deleteLinkedList(struct Node **node)
{
	struct Node *tmpNode;
	while (*node) {
		tmpNode = *node;
		*node = tmpNode->next;
		delete tmpNode;
	}
}

void display(struct Node *head) {
	Node *list = head;
	while (list) {
		cout << list->data << " ";
		list = list->next;
	}
	cout << endl;
	cout << endl;
}

int main()
{
	struct Node  *newHead;
	struct Node *head = new Node;

	//create list - initial node has value of 10
	initNode(head, 10);
	display(head);

	addNode(head, 20);
	display(head);

	addNode(head, 30);
	display(head);

	addNode(head, 40);
	display(head);

	addNode(head, 50);
	display(head);
	// add a node at the front
	insertFront(&head, 5);
	display(head);
	// delete node with value 5
	int numDel = 5;
	Node *ptrDel = searchNode(head, numDel);
	if (deleteNode(&head, ptrDel))
		cout << "Node " << numDel << " deleted\n";
	display(head);

	// creates a reversed struct and displays
	cout << "The list printed in reverse order: ";
	reverse(&head);
	display(head);
	cout << endl;

	// makes a copy of the current list
	cout << "The list is copied: ";
	copyLinkedList(head, &newHead);
	display(newHead);
	cout << endl;

	// delete Node 30
	numDel = 30;
	ptrDel = searchNode(head, numDel);
	if (deleteNode(&head, ptrDel))
		cout << "Node " << numDel << " deleted\n";
	display(head);

	// compares the two list pointed to by head and newHead
	cout << "The lists are compared, and as a result: ";
	if (compareLinkedList(head, newHead))
		cout << "the lists are equal. ";
	else
		cout << "the lists are not equal. ";
	cout << endl;



	system("pause");
	return 0;

}