package org.yan.practice.patterns.behavioral.chain.middleware;

/**
 * @author pangyan
 * @date 2020/5/24 22:54
 * @description 检查用户角色
 */
public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
