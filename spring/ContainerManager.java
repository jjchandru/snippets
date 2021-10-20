package com.revature.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ContainerManager implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware, BeanFactoryAware, BeanPostProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(ContainerManager.class);

    @Override
    public void destroy() throws Exception {
        LOGGER.info("ContainerManager.destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("ContainerManager.afterPropertiesSet()");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LOGGER.info("ContainerManager.setApplicationContext()");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        LOGGER.info("ContainerManager.setBeanFactory()");
        
    }

    @Override
    public void setBeanName(String name) {
        LOGGER.info("ContainerManager.setBeanName()");
        
    }
    
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info("ContainerManager.postProcessBeforeInitialization(): " + beanName);
        return bean;
    }
    
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info("ContainerManager.postProcessAfterInitialization()" + beanName);
        return bean;
    }

}
