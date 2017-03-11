package study.khs.api.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import study.khs.api.message.domain.Message;
import study.khs.api.message.repository.MessageRepository;

/**
 * Created by jaeyoung on 2017. 3. 11..
 */

@Slf4j
@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Message getMessage(@PathVariable String id) {

        log.info("getMessage id=[{}]", id);

        Message message = messageRepository.findOne(id);

        log.info("getMessage message=[{}]", message);

        return message;
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Message postMessage(@RequestBody Message message) {

        log.info("postMessage message=[{}]", message);

        Message savedMessage = messageRepository.save(message);

        log.info("postMessage savedMessage=[{}]", savedMessage);

        return savedMessage;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Message putMessage(@RequestBody Message message) {

        log.info("putMessage message=[{}]", message);

        Message savedMessage = messageRepository.save(message);

        log.info("putMessage savedMessage=[{}]", savedMessage);

        return savedMessage;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMessage(@PathVariable String id) {

        log.info("deleteMessage id=[{}]", id);

        messageRepository.delete(id);
    }
}
