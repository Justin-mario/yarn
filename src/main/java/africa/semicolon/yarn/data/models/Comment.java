package africa.semicolon.yarn.data.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;


@EqualsAndHashCode(callSuper = true)
@Data
public class Comment extends Storable{
    private Integer id;
    private Integer postId;
    private String comment;
    private String commenter;
    private LocalDateTime time;
}
