package guru.springframework.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;


/**
 * Created by jt on 6/13/17.
 */
@Getter
@Setter
@Document
public class UnitOfMeasure {

    private String id;
    private String description;
}
