package com.welab.backend_user.test;

import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


@Getter
@Setter
class UserEntity {
    Long id;

    String userId;

    String phoneNumber;

    boolean child;
}

@Getter
@Setter
class UserDto {
    String userId;
    String phoneNumber;

    public static UserDto fromEntity(UserEntity user) {
        UserDto dto = new UserDto();

        dto.userId = user.getUserId();
        dto.phoneNumber = user.getPhoneNumber();;

        return dto;
    }
}

public class PlayGround {
    @Test
    public void test1() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map( n -> n * 2)
                .toList();
    }

    @Test
    public void test2() {
        UserEntity user1 = new UserEntity();
        user1.setId(1L);
        user1.setUserId("abc1");
        user1.setPhoneNumber("010-0000-0000");
        user1.setChild(false);

        UserEntity user2 = new UserEntity();
        user2.setId(2L);
        user2.setUserId("abc2");
        user2.setPhoneNumber("010-0000-0000");
        user2.setChild(true);

        List<UserEntity> users = Arrays.asList(user1, user2);

        List<UserDto> dtos = users.stream()
                .filter( o -> !o.isChild())
                .map(UserDto::fromEntity)
                .toList();
    }
}
