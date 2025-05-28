package com.welab.backend_alim.remote.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RemoteUserService {
    private final RestTemplate restTemplate;

    public String hello() {
        return restTemplate.getForObject(
                "http://backend-user/backend/user/v1/hello",
                String.class
        );
    }
}
