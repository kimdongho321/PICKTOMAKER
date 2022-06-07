package kr.co.picTO.controller;

import kr.co.picTO.service.qna.UserQnaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class UserQnaController {

    private final UserQnaService userQnaService;
}
