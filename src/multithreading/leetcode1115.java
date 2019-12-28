package multithreading;

public class leetcode1115 {
    class FooBar {
        private int n;
        private volatile boolean flag=true;
        private Object obj;
        public FooBar(int n) {
            this.n = n;
            obj=new Object();
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {

                // printFoo.run() outputs "foo". Do not change or remove this line.
                synchronized(obj){
                    if(!flag){
                        obj.wait();
                    }
                    printFoo.run();
                    flag=false;
                    obj.notifyAll();
                }
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {

                // printBar.run() outputs "bar". Do not change or remove this line.
                synchronized(obj){
                    if(flag){
                        obj.wait();
                    }
                    printBar.run();
                    flag=true;
                    obj.notifyAll();
                }
            }
        }
    }
}
