class FooBar {
     private int n;
    boolean runFoo; // boolean to check if Thread A (the one calling foo()) is in execution
    
    public FooBar(int n) {
        this.n = n;
        runFoo = true;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	synchronized(this) {
                // wait until bar() is running
				while(!runFoo) {
                    wait();
                }
                printFoo.run();
                runFoo = false;
                notifyAll();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
            // printBar.run() outputs "bar". Do not change or remove this line.
            synchronized(this) {
				// wait until foo() is running
                while(runFoo) {
                    wait();
                }
                printBar.run();
                runFoo = true;
                notifyAll();
            }
        }
    }
}