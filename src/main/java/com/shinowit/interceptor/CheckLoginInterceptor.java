package com.shinowit.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2014/12/30.
 */
public class CheckLoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(true);
        if ((null != session) && (session.getAttribute("login_ok") != null)) {
            return true;
        }
        String uri = request.getRequestURI();
        uri = uri.toLowerCase();
        if (uri.startsWith("/mvcdemo2-1.0")) {
            return true;
        }
        //拦截器需要放行的静态资源
        if (uri.startsWith("/static")) {
            return true;
        }

        response.sendRedirect(request.getContextPath() + "/validation/login");
        return false;
    }
}