package dependon;

// Mysql 太慢了，改用 Oracle
public class SomeSerivce {

    public void saveData() {
        MysqlDB mysqlDB = new MysqlDB();
        mysqlDB.save();
    }
}
