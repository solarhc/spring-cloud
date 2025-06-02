package com.welab.api_gateway.gateway.filter;

import com.welab.api_gateway.common.util.HttpUtils;
import com.welab.api_gateway.security.jwt.authentication.UserPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.function.ServerRequest;

import java.util.function.Function;

public class AuthenticationHeaderFilterFunction {
    public static Function<ServerRequest, ServerRequest> addHeader() {
        return request -> {
            ServerRequest.Builder requestBuilder = ServerRequest.from(request);

            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            if( principal instanceof UserPrincipal userPrincipal) {
                requestBuilder.header("X-Auth-UserId", userPrincipal.getUserId());

                // 필요시 권한 정보 입력
                // requestBuilder.header("X-Auth-Authorities", ...);
            }

            String remoteAddr = HttpUtils.getRemoteAddr(request.servletRequest());
            requestBuilder.header("X-Client-Address", remoteAddr);

            // org.springframework.boo:spring-boot-starter-mobile:1.5.22.RELEASE

            String device = "WEB";
            requestBuilder.header("X-Client-Device", device);

            return requestBuilder.build();
        };
    }
}
