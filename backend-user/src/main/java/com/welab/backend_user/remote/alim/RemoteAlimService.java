package com.welab.backend_user.remote.alim;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RemoteAlimService {
    private final RestTemplate restTemplate;

    public String hello() {
        return restTemplate.getForObject(
                "http://alim-service/backend/alim/v1/hello",
                String.class
        );
    }
}
