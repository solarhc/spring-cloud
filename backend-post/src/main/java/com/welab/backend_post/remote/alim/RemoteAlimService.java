package com.welab.backend_post.remote.alim;

import com.welab.backend_post.remote.alim.dto.SendSmsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "backend-alim", path = "/backend/alim/v1")
public interface RemoteAlimService {
    @PostMapping(value = "/sms")
    public SendSmsDto.Response sms(@RequestBody SendSmsDto.Request request);
}
