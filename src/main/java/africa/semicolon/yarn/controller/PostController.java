package africa.semicolon.yarn.controller;

import africa.semicolon.yarn.data.models.Post;
import africa.semicolon.yarn.dto.requests.AddCommentRequest;
import africa.semicolon.yarn.dto.requests.CreatePostRequest;
import africa.semicolon.yarn.dto.responses.CreatePostResponse;
import africa.semicolon.yarn.dto.responses.FindPostResponse;
import africa.semicolon.yarn.services.PostService;
import africa.semicolon.yarn.services.PostServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    private final PostService postService = new PostServiceImpl ();

    @PostMapping("/api/post")
    public CreatePostResponse addPost(@RequestBody CreatePostRequest createPostRequest){
        return postService.addPost(createPostRequest);
    }
    @GetMapping("/api/post/{id}")
    public FindPostResponse findPostById(@PathVariable("id") Integer id){
        return postService.findPostById( id);
    }

    @PostMapping("/api/comment")
    public CreatePostResponse addComment(@RequestBody AddCommentRequest addCommentRequest){
        return   postService.addComment(addCommentRequest);
    }
}


