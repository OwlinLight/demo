package cn.edu.zjut.ejb.lifecycle;

import javax.ejb.Remote;

@Remote
public interface LifeCycleRemote {
    public void hello(String name);

    public void removeSession();
}