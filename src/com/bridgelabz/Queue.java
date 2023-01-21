package com.bridgelabz;

import java.util.LinkedList;

public class Queue<E> {

        private LinkedList<E> linkedList = new LinkedList<>();

///* adding item in Queue (adding head) */
//	void enqueue(E item) {
//		linkedList.push(item);
//	}
///* deleting item in queue (delete head) */
//	void dequeue() {
//		linkedList.pop();
//	}


        /* adding items in Queue (adding tail)*/
        public void enqueue(E item) {
            linkedList.append(item);
        }

        /* deleting item in queue (delete tail) */
        public void dequeue() {
            linkedList.popLast();
        }

        /*showing the full Queue*/
        public void display() {
            linkedList.display();
        }

        /*searching a value in queue*/
        public boolean searchData(E data) {
            if(linkedList.search(data) != null)
                return true;
            return false;
        }


    }


}
