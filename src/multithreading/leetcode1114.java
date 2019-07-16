package multithreading;

/**
 * 设置synchronized同步块，只有first执行完了second才能执行，最后third执行
 * 否则其他的拿到了synchronized锁也不能用，wait()会暂时释放锁，进入等待
 * 直到lock执行notifyAll通知
 */
public class leetcode1114 {
    private Object lock=new Object();
    private boolean First=false;
    private boolean Second=false;
    //原题public Foo() {
    //
    //    }
    public leetcode1114() {

    }
    //第一个线程，但不代表线程A
    public void first(Runnable printFirst) throws InterruptedException {
        synchronized(lock){

            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            First=true;
            lock.notifyAll();
        }

    }
    //第二个线程，但不代表线程B
    public void second(Runnable printSecond) throws InterruptedException {
        synchronized(lock){
            while(!First){
                lock.wait();
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            Second=true;
            lock.notifyAll();
        }
    }
    //第三个线程，但不代表线程C
    public void third(Runnable printThird) throws InterruptedException {
        synchronized(lock){
            while(!Second){
                lock.wait();
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
}
