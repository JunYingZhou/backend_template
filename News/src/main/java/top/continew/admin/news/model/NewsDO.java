package top.continew.admin.news.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Data
@Setter
public class NewsDO {
    // Getters and Setters
    private Long id;
    private String username;
    private String gender;
    private String email;
}
