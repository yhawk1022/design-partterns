package org.yan.practice.patterns.behavioral.chain;

/**
 * @author pangyan
 * @date 2020/5/14 23:21
 * @description 基础验证接口
 */
public abstract class Middleware {

    private Middleware next;

    public Middleware linkWith(Middleware next){
        this.next = next;
        return next;
    }

    public abstract boolean check(String email,String password);

    protected boolean checkNext(String email, String password){
        if (null == next){
            return true;
        }
        return next.check(email, password);
    }
}
