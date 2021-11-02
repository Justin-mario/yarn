package africa.semicolon.yarn.controller;

import africa.semicolon.yarn.dto.requests.AddCommentRequest;
import africa.semicolon.yarn.dto.responses.CreatePostResponse;
import africa.semicolon.yarn.services.PostService;
import africa.semicolon.yarn.services.PostServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
//    private final PostService commentService = new PostServiceImpl ();
//
//    @PostMapping("/api/comment")
//    public CreatePostResponse addComment(@RequestBody AddCommentRequest addCommentRequest){
//      return   commentService.addComment(addCommentRequest);
//    }
}
