package app.user.own;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@Builder
@ToString
public class User {
    private String name;
    private String lastName;
    private Double age;
}
