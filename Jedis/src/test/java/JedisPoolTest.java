import com.woldier.redis.tools.RedisFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class JedisPoolTest {

    private Jedis jedis;
    @Before
    public void setUp() throws Exception {
        /*连接*/
        jedis = RedisFactory.getJedis();
        /*授权*/
        //jedis.auth();
        /*选择库*/
        //jedis.select(0);
    }

    @After
    public void after() throws Exception {
        if(jedis != null)
            jedis.close();
    }


    @Test
    public void test(){
        jedis.set("woldier-in-java-jedisPool","111");
    }


}
