package projectmicroservice.h2databaseexample.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookDTO {

    private Long id;

    private String name;

    private Integer price;

    private String author;
}
