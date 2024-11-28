package com.ds.heap;

public class MaxHeap {
	
	int[] heap;
	int size;
	int capacity;
	
	public MaxHeap(int capacity) {
		super();
		this.heap = new int[capacity];
		this.size = 0;
		this.capacity = capacity;
	}
	
	public int parent(int index) {
		return(index-1)/2;
	}
	
	public int Lchild(int index) {
		return (2*index)+1;
	}
	public int Rchild(int index) {
		return (2*index)+2;
	}
	
	public void Swap(int index1, int index2) {
		int temp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = temp;
		
	}
	
	public void insert(int value) {
		if(size==capacity) {
			throw new IllegalStateException("Heap is full");
		}
		else {
			heap[size] = value;
			size++;
			heapifyUp(size-1);
		}
	}
	public void heapifyUp(int index) {
		while(index!=0 && heap[parent(index)]< heap[index]) {
			Swap(parent(index), index);
			index = parent(index);
		}
	}
	
	public int removeMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int maxValue = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return maxValue;
    }
    private void heapifyDown(int current) {
        int maxIndex = current;
        int left = Lchild(current);
        int right = Rchild(current);
 
        if (left < size && heap[left] > heap[maxIndex]) {
        	maxIndex = left;
        }
        if (right < size && heap[right] > heap[maxIndex]) {
        	maxIndex = right;
        }
        if (maxIndex != current) {
            Swap(current, maxIndex);
            heapifyDown(maxIndex);
        }
    }
    
	public boolean isEmpty() {
		return (size==0);
	}
	
	public int getMax() {
		if(size==0) {
			throw new IllegalStateException("Heap is empty!");
		}
		return heap[0];
	}

	

}
