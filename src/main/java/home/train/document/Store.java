package home.train.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Store {

    @Id
    private String id;
    private String owner;
    private String name;
    private Address address;
    private String number;

    public Store(String owner, String name, Address address, String number) {
        this.owner = owner;
        this.name = name;
        this.address = address;
        this.number = number;
    }
}
