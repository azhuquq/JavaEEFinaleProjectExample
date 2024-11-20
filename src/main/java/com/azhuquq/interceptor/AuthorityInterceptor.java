package com.azhuquq.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

public class AuthorityInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        int sright = (Integer) session.getAttribute("sright");
        System.out.println("[Debug] 用户的登录权限为" + sright);
        if (sright != 1) {
            response.sendRedirect(request.getContextPath() + "/index.html");
            return false;
        } else
            return true;
    }
}
