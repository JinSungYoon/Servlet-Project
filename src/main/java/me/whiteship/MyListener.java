package me.whiteship;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Initialized");
        sce.getServletContext().setAttribute("name","keesun");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context Desdroyed");
    }
}
