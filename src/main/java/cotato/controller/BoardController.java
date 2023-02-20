package cotato.controller;

import cotato.dto.board.AddPostDto;
import cotato.service.BoardService;
import cotato.vo.response.ApiResponse;
import cotato.dto.board.BoardDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping(value = "/add",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<ApiResponse> addPost(@RequestPart AddPostDto addPostDto,
                                               @RequestPart List<MultipartFile> files) {
        boardService.saveBoardPost(addPostDto,files);
        return new ApiResponse.ApiResponseBuilder<>(HttpStatus.OK)
                .success(true)
                .message("Board Add Success")
                .data(addPostDto)
                .build();
    }

    @GetMapping("/user/posts")
    public ResponseEntity<ApiResponse> searchUserPost() {
        List<BoardDto> result = boardService.findPostByUserName();
        return new ApiResponse.ApiResponseBuilder<>(HttpStatus.OK)
                .success(true)
                .message("Search Success")
                .data(result)
                .build();
    }

    @GetMapping("/search")
    public ResponseEntity<ApiResponse> searchPost(@RequestParam("keyword") String keyword) {
        log.info("{}",keyword);
        List<BoardDto> result =  boardService.findPostByKeyword(keyword);
        return new ApiResponse.ApiResponseBuilder<>(HttpStatus.OK)
                .success(true)
                .message("Search Success")
                .data(result)
                .build();
    }
}
