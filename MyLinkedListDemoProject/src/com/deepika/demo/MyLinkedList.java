package com.deepika.demo;

public class MyLinkedList {

	class Node{
		int data;
		Node next;
		public Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}
	}
	
	Node head;
	
	public void insert(int data) {
		Node newNode=new Node(data,null);
		//if list is not there, make this node as first node ( by pointing head on newly created node)
		if(this.head==null) {
			this.head=newNode;
		}
		else {
			Node lastNode=this.head;
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
			lastNode.next=newNode;
		}
	
	}
	
	public void traverse() {
		Node currentNode=this.head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
	public void deleteNode(int elem) {
		if(this.head.data==elem) {
			this.head=this.head.next;
		}
		else {
			Node prevNode=head;
			while(prevNode.next.data!= elem && prevNode!=null) {
				prevNode=prevNode.next;
			}
			if(prevNode!=null) {
				prevNode.next=prevNode.next.next;
			}
		}
	}
	public void findFrequency() {
		for(int i=0;i<=9;i++) {
			Node curNode=this.head;
			int count=0;
			while(curNode!=null) {
				int temp=curNode.data;
				while(temp!=0) {
					if(temp%10==i) {
						count++;
					}
					temp/=10;
				}
				curNode=curNode.next;
			}
			System.out.println("Count of "+i+" : "+count);
		}
	}
}
