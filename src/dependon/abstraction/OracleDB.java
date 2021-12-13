package dependon.abstraction;

public class OracleDB implements DB {
    @Override
    public void save() {
        System.out.println("========> Oracle save");
    }
}
