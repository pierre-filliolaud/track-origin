package net.filecode.trackorigin.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class LoggingFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(LoggingFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code if needed
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String ipAddress = request.getRemoteAddr();
        String userAgent = httpServletRequest.getHeader("User-Agent");
        String referrer = httpServletRequest.getHeader("Referer");

        logger.info("IP Address: {}", ipAddress);
        logger.info("User Agent: {}", userAgent);
        logger.info("Referrer: {}", referrer);

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // Cleanup code if needed
    }
}
