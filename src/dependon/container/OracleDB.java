package dependon.container;

public class OracleDB implements DB {
    @Override
    public void save() {
        System.out.println("========> Oracle save");
    }
}
