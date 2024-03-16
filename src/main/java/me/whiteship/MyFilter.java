package me.whiteship;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter Init");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter");
        filterChain.doFilter(request,response);
    }

    public void destroy() {
        System.out.println("Filter Destroy");
    }
}
