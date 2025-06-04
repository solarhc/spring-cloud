package com.welab.backend_user.api.backend;

import com.welab.backend_user.common.dto.ApiResponseDto;
import com.welab.backend_user.domain.dto.SiteUserInfoDto;
import com.welab.backend_user.domain.dto.UserInfoDto;
import com.welab.backend_user.service.SiteUserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/backend/user/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class BackendUserController {
    private final SiteUserService siteUserService;

    @GetMapping(value = "/user/{userId}")
    public ApiResponseDto<SiteUserInfoDto> userInfo(@PathVariable String userId) {
        SiteUserInfoDto userInfoDto = siteUserService.userInfo(userId);
        return ApiResponseDto.createOk(userInfoDto);
    }
}
