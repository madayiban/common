package com.mada.mq.redis.p2p;

import com.mada.mq.services.p2p.IProducerHandler;
import com.mada.mq.utils.RedisUtil;
import lombok.extern.log4j.Log4j2;
import redis.clients.jedis.Jedis;

/**
 * Created by madali on 2017/4/27.
 */
@Log4j2
public class RedisProducerHandler implements IProducerHandler {

    private final Jedis JEDIS;
    private final String TOPIC;

    public RedisProducerHandler(String topic) {
        JEDIS = RedisUtil.connect();
        TOPIC = topic;
    }

    @Override
    public void produce(String message) {
        try {
            JEDIS.lpush(TOPIC, message);
            log.info("Produce redis message: " + message);
        } catch (Throwable t) {
            log.error("Produce redis message error.", t);
        }
    }

    @Override
    public void close() {
        RedisUtil.disConnect(JEDIS);
        log.info("Close the redis producer (Topic = {}).", TOPIC);
    }
}
