package Synchronized;

public class SynchronizedExchanger {
    protected Object object = null;

    public synchronized void setObject(Object obj){
        this.object = obj;
    }

    public synchronized Object getObject(){
        return this.object;
    }

    public void setObjectj(Object obj){
        synchronized (this){
            this.object = obj;
        }
    }

    public Object getObjectj(){
        synchronized (this){
            return this.object;
        }
    }
}
