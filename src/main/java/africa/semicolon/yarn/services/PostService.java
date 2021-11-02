package africa.semicolon.yarn.services;

import africa.semicolon.yarn.data.models.Post;
import africa.semicolon.yarn.dto.requests.AddCommentRequest;
import africa.semicolon.yarn.dto.requests.CreatePostRequest;
import africa.semicolon.yarn.dto.responses.CreatePostResponse;
import africa.semicolon.yarn.dto.responses.FindPostResponse;

import java.util.List;

public interface PostService {
    CreatePostResponse addPost(CreatePostRequest createPostRequest);
    FindPostResponse findPostById(Integer id);
    CreatePostResponse addComment(AddCommentRequest addCommentRequest);
    void deletePostById(Integer id);
    List<Post> findAll();
}
