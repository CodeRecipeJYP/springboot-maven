package study.khs.api.message.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by jaeyoung on 2017. 3. 11..
 */
@Data // This makes getter setter
@Entity
public class Message {

    @Id
    private String id;

    @Column(nullable = false)
    private String message;
}