package africa.semicolon.yarn.data.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
public class Post extends Storable{

    private Integer id;
    private String title;
    private LocalDateTime time;
    private String body;
    private List<Comment> comments = new ArrayList<> ();
}
