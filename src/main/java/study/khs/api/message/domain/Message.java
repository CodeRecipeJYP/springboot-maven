package study.khs.api.message.domain;

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