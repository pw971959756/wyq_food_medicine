package com.xd.wyq.food.medicine.support;

import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;

public class StartAppListener extends ContextLoaderListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("------------------------ Start  Event ");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        super.contextDestroyed(event);
    }




}
