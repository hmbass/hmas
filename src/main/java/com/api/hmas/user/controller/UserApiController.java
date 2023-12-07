package com.api.hmas.user.controller;

import com.api.hmas.user.model.UserResponse;
import com.api.hmas.user.service.UserApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserApiController {
    private final UserApiService userApiService;

    @GetMapping("/test/")
    public ResponseEntity<?> getUserInfo(@RequestParam Long id) throws Exception
        UserResponse userResponse = userApiService.getUserInfo(id);
        return ResponseEntity.ok(userResponse);
    }
}
