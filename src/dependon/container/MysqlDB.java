package dependon.container;

public class MysqlDB implements DB {
    @Override
    public void save() {
        System.out.println("========> mysql save");
    }
}
