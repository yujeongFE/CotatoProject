package cotato.controller;

import cotato.dto.board.AddPostDto;
import cotato.service.BoardService;
import cotato.vo.response.ApiResponse;
import cotato.dto.board.BoardDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addPost(@RequestBody AddPostDto addPostDto) {
        boardService.saveBoardPost(addPostDto);
        return new ApiResponse.ApiResponseBuilder<>(HttpStatus.OK)
                .success(true)
                .message("Board Add Success")
                .data(addPostDto)
                .build();
    }

    @GetMapping("/search")
    public ResponseEntity<ApiResponse> searchPost(@RequestParam("keyword") String keyword) {
        List<BoardDto> postList =  boardService.findPostByKeyword(keyword);
        return new ApiResponse.ApiResponseBuilder<>(HttpStatus.OK)
                .success(true)
                .message("Search Success")
                .data(postList)
                .build();
    }
}
