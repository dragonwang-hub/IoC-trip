package dependon.specific;

public class SomeSerivce {

    public void saveData() {
        MysqlDB mysqlDB = new MysqlDB();
        mysqlDB.save();
    }
}
