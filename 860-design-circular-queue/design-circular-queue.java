class MyCircularQueue {
   int[] arr;
   int front;
   int s;
    public MyCircularQueue(int k) {
        arr=new int[k];
        front=0;
        s=0;
    }
    
    public boolean enQueue(int value) {
       if(s==arr.length){
        return false;
       }
       int idx=(front+s)%arr.length;
       arr[idx]=value;
       s++;
       return true;

    }
    
    public boolean deQueue() {
        if(s==0){
            return false;
        }
        front=(front+1)%arr.length;
        s--;
        return true;
        }
    
    public int Front() {
    if(s==0) return -1; 
    return arr[front];   
    }

    public int Rear() {
        if(s==0) return -1;
        int idx=(front+s-1)%arr.length;
        return arr[idx];
    }
    
    public boolean isEmpty() {
        return s==0;
    }
    
    public boolean isFull() {
        return s==arr.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */