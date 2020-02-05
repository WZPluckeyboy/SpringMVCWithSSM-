import com.ping.Dao.AccountDao;
import com.ping.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class TestMybatis {
    @Test
    public void test() throws  Exception{
       InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        SqlSession session=factory.openSession();
        AccountDao accountDao= session.getMapper(AccountDao.class);
        accountDao.findAll();
        session.close();
        in.close();

    }
    @Test
    public void test1() throws  Exception{
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        SqlSession session=factory.openSession();
        AccountDao accountDao= session.getMapper(AccountDao.class);
        Account account=new Account();
        account.setName("张三");
        account.setMoney(2000.22);
        accountDao.saveAccount(account);
        session.commit();
        session.close();
        in.close();

    }
}
