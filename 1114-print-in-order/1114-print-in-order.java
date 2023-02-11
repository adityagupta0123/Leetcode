class Foo {

    Semaphore semaphore1;
    public Foo() {
        semaphore1 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        semaphore1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(!semaphore1.tryAcquire(1));
        
        printSecond.run();
        semaphore1.release(2);
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(!semaphore1.tryAcquire(2));
        
        printThird.run();
    }
}