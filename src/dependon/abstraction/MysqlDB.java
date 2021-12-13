package dependon.abstraction;

public class MysqlDB implements DB {
    @Override
    public void save() {
        System.out.println("========> mysql save");
    }
}
