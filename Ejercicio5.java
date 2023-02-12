public interface CocheCRUD {

    void save();

    String findAll();

    void delete();
}

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("SAVE");
    }

    @Override
    public String findAll() {
        return "findAll";
    }

    @Override
    public void delete() {
        System.out.println("DELETE");
    }
}

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();
    public static void main(String[] args) {

        cocheCRUD.save();

        System.out.println(cocheCRUD.findAll());

        cocheCRUD.delete();
    }
}
