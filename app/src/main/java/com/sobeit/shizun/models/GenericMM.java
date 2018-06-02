package com.sobeit.shizun.models;

import java.util.ArrayList;
import java.util.List;

public class GenericMM<A extends com.orm.SugarRecord> {

    public long save(A mm) {
        return mm.save();
    }
    public void save(ArrayList<A> list) {
        A.saveInTx(list);
    }

    public void delete(A mm) {
        A.delete(mm);
    }

    public List<A> listAll(Class<A> azClass){
        return A.listAll(azClass);
    }

    public A findClass(A mm){
        return mm;
    }
}
