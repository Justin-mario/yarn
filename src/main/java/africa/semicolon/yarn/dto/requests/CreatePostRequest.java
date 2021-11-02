package africa.semicolon.yarn.dto.requests;

import lombok.Data;

@Data
public class CreatePostRequest {
    private String title;
    private String body;
}
