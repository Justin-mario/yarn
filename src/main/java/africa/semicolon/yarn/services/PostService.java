package africa.semicolon.yarn.services;

import africa.semicolon.yarn.dto.requests.AddCommentRequest;
import africa.semicolon.yarn.dto.requests.CreatePostRequest;
import africa.semicolon.yarn.dto.responses.CreatePostResponse;
import africa.semicolon.yarn.dto.responses.FindPostResponse;

public interface PostService {
    CreatePostResponse addPost(CreatePostRequest createPostRequest);

    FindPostResponse findPostById(Integer id);
    CreatePostResponse addComment(AddCommentRequest addCommentRequest);
}
