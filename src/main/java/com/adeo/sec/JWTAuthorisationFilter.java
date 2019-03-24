package com.adeo.sec;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JWTAuthorisationFilter extends OncePerRequestFilter {
    private static final Logger LOGGER = LogManager.getLogger(JWTAuthorisationFilter.class);
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

        LOGGER.info("***********");
        String jwt=httpServletRequest.getHeader("Authorization");
        if(jwt==null) throw new RuntimeException("Not Authorize");
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}
