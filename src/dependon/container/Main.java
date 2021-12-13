package dependon.container;

public class Main {

    static {
        MiddleContainer.setObject(new MysqlDB());
        MiddleContainer.setObject(new OracleDB());
    }

    public static void main(String[] args) {
	    new SomeSerivce().saveData();
    }
}
