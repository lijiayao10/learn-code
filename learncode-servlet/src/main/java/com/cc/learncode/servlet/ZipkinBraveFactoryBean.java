/*
 * @author caojiayao 2017年4月10日 下午6:18:52
 */
package com.cc.learncode.servlet;

import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.FactoryBean;

import com.github.kristofa.brave.Brave;
import com.github.kristofa.brave.EmptySpanCollectorMetricsHandler;
import com.github.kristofa.brave.Sampler;
import com.github.kristofa.brave.http.HttpSpanCollector;

/**
 * <p><p>
 * @author caojiayao 
 * @version $Id: ZipkinBraveFactoryBean.java, v 0.1 2017年4月10日 下午6:18:52 caojiayao Exp $
 */
public class ZipkinBraveFactoryBean implements FactoryBean<Brave> {
    
    private String serviceName;
    private String zipkinHost;
   
    private Brave instance;
   
    public void setServiceName(final String serviceName) {
      this.serviceName = serviceName;
    }
   
    public void setZipkinHost(final String zipkinHost) {
      this.zipkinHost = zipkinHost;
    }
   
    private void createInstance() {
      if (this.serviceName == null) {
        throw new BeanInitializationException("Property serviceName must be set.");
      }
   
      Brave.Builder builder = new Brave.Builder(this.serviceName);
      builder.traceSampler(Sampler.ALWAYS_SAMPLE);
      if (this.zipkinHost != null && !"".equals(this.zipkinHost)) {
        builder.spanCollector(HttpSpanCollector.create(
          this.zipkinHost, new EmptySpanCollectorMetricsHandler()));
      }
      this.instance = builder.build();
    }
   
    @Override
    public Brave getObject() throws Exception {
      if (this.instance == null) {
        this.createInstance();
      }
      return this.instance;
    }
   
    @Override
    public Class<?> getObjectType() {
      return Brave.class;
    }
   
    @Override
    public boolean isSingleton() {
      return true;
    }
  }
