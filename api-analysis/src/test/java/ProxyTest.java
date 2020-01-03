import com.storm.common.aspect.SimpleAspect;
import com.storm.common.interceptor.SimpleAspectCglibInterceptor;
import com.storm.common.interceptor.SimpleCglibInterceptor;
import com.storm.service.ISingleDemoSrv;
import com.storm.service.impl.SingleDemoSrv;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void test1(){
        ISingleDemoSrv singleDemoSrv = new SingleDemoSrv();
        SimpleCglibInterceptor interceptor = new SimpleCglibInterceptor(singleDemoSrv,ISingleDemoSrv.class);
        ISingleDemoSrv proxy = (ISingleDemoSrv) interceptor.getProxy();
        proxy.doSomething();
    }

    @Test
    public void test2(){
        ISingleDemoSrv singleDemoSrv = new SingleDemoSrv();
        SimpleAspect aspect = new SimpleAspect();
        SimpleAspectCglibInterceptor interceptor = new SimpleAspectCglibInterceptor(singleDemoSrv,ISingleDemoSrv.class,aspect);
        ISingleDemoSrv proxy = (ISingleDemoSrv) interceptor.getProxy();
        proxy.doSomething();
    }

    @Test
    public void test3(){

    }

}
