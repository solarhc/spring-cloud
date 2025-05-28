package com.welab.backend_user.api.open;

import com.welab.backend_user.remote.alim.RemoteAlimService;
import com.welab.backend_user.remote.alim.dto.SendSmsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/user/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class UserController {
    private final RemoteAlimService remoteAlimService;

    @GetMapping(value = "/test")
    public String test() {
        return remoteAlimService.hello();
    }

    @PostMapping(value = "/sms")
    public SendSmsDto.Response sms(@RequestBody SendSmsDto.Request request) {
        var response = remoteAlimService.sendSms(request);
        return response;
    }
}
