package dependon.container;

// Mysql 太慢了, Oracle 太贵了， 我要自己写个数据库用
// 每次都要这样改，太难受了
public class SomeSerivce {

    private String DBname = "MysqlDB";

    public void saveData() {
        DB db = (DB) MiddleContainer.getObject(DBname);
        db.save();
    }
}

// 下一步 只需要把DBname通过配置文件注入方式传递进来，即完成分离
