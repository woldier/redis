import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class JedisTest {

    private Jedis jedis;
    @Before
    public void setUp() throws Exception {
        /*连接*/
        jedis = new Jedis("192.168.59.130",6379);
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
        jedis.set("woldier-in-java","111");
    }


}
