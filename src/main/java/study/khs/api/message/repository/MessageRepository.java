package study.khs.api.message.repository;

import org.springframework.data.repository.CrudRepository;
import study.khs.api.message.domain.Message;

/**
 * Created by jaeyoung on 2017. 3. 11..
 */
public interface MessageRepository extends CrudRepository<Message, String> {

}
