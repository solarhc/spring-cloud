package com.welab.backend_user.secret.jwt.props;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(value = "jwt", ignoreInvalidFields = true)
@Getter
@Setter
public class JwtConfigProperties {
    private Integer expiresIn;
    private Integer mobileExpiresIn;
    private Integer tabletExpiresIn;
    private String secretKey;
}
