package sdcc2018.spring.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class RankElement {

    @Field("rank")
    private int rank;

    @Field("idIntersection")
    private int idIntersection;

    @Field("meanSpeed")
    private double meanSpeed;
}
