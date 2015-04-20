package com.alex.wang.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import com.alex.wang.common.LoggerManager;

public class AccessFilter implements Filter {

    public void destroy() {
        // TODO Auto-generated method stub
        
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain filter) throws IOException, ServletException {
        LoggerManager.recordInfo(filter.getClass().getName());
        filter.doFilter(request, response);
        LoggerManager.recordInfo("finished");
        
        
    }

    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
        
    }

}
