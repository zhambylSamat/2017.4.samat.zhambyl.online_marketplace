package kz.sdu.project.stand.beans;

import kz.greetgo.depinject.core.Bean;
import kz.sdu.project.stand.util.WebAppContextRegistration;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.webapp.WebAppContext;

import javax.servlet.*;
import java.io.IOException;
import java.util.EnumSet;

@Bean
public class Utf8FilterRegistration implements WebAppContextRegistration, Filter {

    @Override
    public void registerTo(WebAppContext webAppContext) {
        webAppContext.addFilter(new FilterHolder(this), "/*", EnumSet.of(DispatcherType.INCLUDE,
                DispatcherType.REQUEST));
        printRegistration();
    }

    @Override
    public double priority() {
        return -200;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
