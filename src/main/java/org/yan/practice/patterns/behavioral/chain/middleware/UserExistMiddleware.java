package org.yan.practice.patterns.behavioral.chain.middleware;

import org.yan.practice.patterns.behavioral.chain.Server;

/**
 * @author pangyan
 * @date 2020/5/24 22:50
 * @description 检查用户登录信息
 */
public class UserExistMiddleware extends Middleware {
    private Server server;

    public UserExistMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}
