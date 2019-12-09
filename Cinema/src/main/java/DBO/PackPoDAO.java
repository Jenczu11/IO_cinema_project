package DBO;


import Model.PackPO;
import Tools.BaseDB;
import lombok.var;

import java.util.List;

public class PackPoDAO {
    public static List getAll() {
        var so = BaseDB.openConnection();
        so.beginTransaction();
        List result = so.createQuery("from PackPO").list();
        so.getTransaction().commit();
        so.close();
        return result;
    }

    public static void insert(PackPO object) {
        var so = BaseDB.openConnection();
        so.beginTransaction();
        so.save(object);
        so.getTransaction()
                .commit();
        so.close();
    }

    public static List getAllById(long Id) {
        var so = BaseDB.openConnection();
        so.beginTransaction();
        List result = so.createQuery("from PackPO where PackHId = " + String.valueOf(Id)).list();
        so.getTransaction().commit();
        so.close();
        return result;
    }
}